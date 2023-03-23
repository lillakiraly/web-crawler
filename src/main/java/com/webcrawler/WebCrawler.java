package com.webcrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Set;

public class WebCrawler {
    private Set<String> visitedLinks;

    public WebCrawler(Set<String> visitedLinks) {
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