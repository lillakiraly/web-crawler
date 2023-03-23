package com.webcrawler.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Set;

@Service
public class CrawlerService {
    private static final int DEFAULT_DEPTH = 1;

    private Set<String> visitedLinks;

    public CrawlerService(Set<String> visitedLinks) {
        this.visitedLinks = visitedLinks;
    }

    public Document connectToPage(String url) throws IOException {
        return Jsoup.connect(url).get();
    }


    public void crawlPage(String url, int depth) {
        if (!visitedLinks.contains(url) && 0 <= depth
                //cannot handle href="javascript:(some function)"
                && (url.contains("http") || url.contains("https"))) {
            System.out.println(url);
            visitedLinks.add(url);
            try {
                Document document = connectToPage(url);
                Elements linksOnDocument = document.select("a[href]");
                for (Element element : linksOnDocument) {
                    String link = element.attr("abs:href");
                    crawlPage(link, depth - 1);
                }
            } catch (IOException ioException) {
                System.out.println(ioException);
            }
        }
    }
}
