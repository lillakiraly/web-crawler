# WebCrawler

## About
WebCrawler is a REST API, that crawls a provided website to a given depth and returns results. 

In simpler terms, you can provide a website, then the crawler will collect all the links on the site, and collect all the links on those sites, until it reaches the provided depth (default depth is 1).

The crawler algorithm uses DFS (depth first search).

## Technologies used
- ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
- ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
- ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
- jsoup
- Jackson
- Lombok

## Getting Started
### Prerequisites
- Java 11
- Maven 3.6

### Setup
1. Clone repo

```sh
git clone https://github.com/lillakiraly/web-crawler.git
```

2. Navigate to the root directory (where the pom.xml file is) 

3. Compile and package the project

```sh
mvn package
```

4. Run the project

```sh
java -jar webcrawler-0.0.1-SNAPSHOT.jar
```

The project will be hosted on http://localhost:8080/ .

## Usage
1. **Get/crawl all links on a given URL, with the provided depth**

Send a GET request to the `/api/links` endpoint.

The request body should include the following information:

- **url** (required): the starting point of the crawl.
- **depth** (optional): *default depth is 1*.

***JSON***:

With provided depth:
```json
{
  "url": "https://example.com/",
  "depth": 2
}
```

With default depth:

```json
{
  "url": "https://example.com/"
}
```

***XML***:

With provided depth:
```xml
<data>
  <url>https://example.com/</url>
  <depth>2</depth>
</data>
```

With default depth:
```xml
<data>
  <url>https://example.com/</url>
  <depth>2</depth>
</data>
```


current/implemented features - roadmap

planned features

Limitations:
- href="javascript:{some js code}" problems
- 403 http status code problems

## Acknowledgements
- Badges: https://github.com/Ileriayo/markdown-badges

## Helpful links
- Java (download, installation): https://www.oracle.com/java/technologies/downloads/
- Maven (download, installation): https://maven.apache.org/download.cgi
