package com.webcrawler.controller;

import com.webcrawler.dto.CrawlerRequestDto;
import com.webcrawler.service.CrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/")
public class CrawlerController {
    private CrawlerService crawlerService;

    @Autowired
    public CrawlerController(CrawlerService crawlerService) {
        this.crawlerService = crawlerService;
    }

    @GetMapping
    public Set<String> getCrawlResults(@RequestBody CrawlerRequestDto req) {
        Set<String> collectedUrls = crawlerService.crawl(req);
        return collectedUrls;
    }

}
