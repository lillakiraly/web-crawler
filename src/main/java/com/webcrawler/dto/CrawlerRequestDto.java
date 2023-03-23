package com.webcrawler.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrawlerRequestDto {
    private String url;
    private int depth;
}
