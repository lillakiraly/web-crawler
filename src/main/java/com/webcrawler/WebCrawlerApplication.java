package com.webcrawler;

import java.util.HashSet;

public class WebCrawlerApplication {
    public static void main(String[] args) {
        WebCrawler webCrawler = new WebCrawler(new HashSet<String>());

        webCrawler.crawlPage("https://example.com/", 1);
    }
}
