# WebCrawler

## About
WebCrawler is a project, that automates the collecting process of links throughout the web.

Current TechStack: Java, Spring Boot, Jsoup

## How to use it
#### Providing the URL(as a crawling start point) and depth (how far should the crawler go)
Send a GET request, with a JSON body, that has the following keys:
```json
{
  "url": "https://example.com/",
  "depth": 1
}
```


current/implemented features

planned features

Limitations:
- href="javascript:{some js code}" problems
- 403 http status code problems
