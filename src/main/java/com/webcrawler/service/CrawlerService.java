package com.webcrawler.service;

import com.webcrawler.dto.CrawlerRequestDto;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Service
public class CrawlerService {
    private static final int DEFAULT_DEPTH = 1;

    public Set<String> crawl(CrawlerRequestDto crawlerRequestDto) {
        Set<String> visitedLinks = new HashSet<>();
        crawlPage(crawlerRequestDto.getUrl(), crawlerRequestDto.getDepth(), visitedLinks);
        return visitedLinks;
    }

    private void crawlPage(String url, int depth, Set<String> visitedLinks) {
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
                    crawlPage(link, depth - 1, visitedLinks);
                }
            } catch (IOException ioException) {
                System.out.println(ioException);
            }
        }
    }

    private Document connectToPage(String url) throws IOException {
        return Jsoup.connect(url).get();
    }
}
