# WebCrawler

## About
WebCrawler is a project, that automates the collecting process of links throughout the web.

Current TechStack: Java, Spring Boot, Jsoup

## How to use it
#### Providing the URL(as a crawling start point) and depth (how far should the crawler go)
Send a GET request, with the following keys:
- **url**
- **depth**

*With JSON*:
```json
{
  "url": "https://example.com/",
  "depth": 1
}
```

*With XML*:
```xml
<data>
  <url>https://example.com/</url>
  <depth>1</depth>
</data>
```


current/implemented features

planned features

Limitations:
- href="javascript:{some js code}" problems
- 403 http status code problems
