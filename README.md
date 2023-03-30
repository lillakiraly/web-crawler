# WebCrawler

## About
WebCrawler is a REST API, that crawls a provided website to a given depth and returns results. 

In simpler terms, you can provide a website, then the crawler will collect all the links on the site, and collect all the links on those sites, until it reaches the provided depth (default depth is 1).

The crawler algorithm uses DFS (depth first search).

## Technologies used
- ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
- ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
- jsoup
- Jackson
- Lombok
- ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

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

## Acknowledgements
- Badges: https://github.com/Ileriayo/markdown-badges
