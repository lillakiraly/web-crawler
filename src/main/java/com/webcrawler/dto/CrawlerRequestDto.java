package com.webcrawler.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CrawlerRequestDto {
    private String url;
    private int depth;
}
