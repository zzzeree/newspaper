import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Link {

    public String getTitle(String url) throws Exception {
        Document mainpage = Jsoup.connect(url).get();

        Element link2 = mainpage.select("div.main-news_super_item a").first();
        String url1 = link2.absUrl("href");

        Document doc = Jsoup.connect(url1).get();
        return doc.select("h1").text();
    }

    public String getAuthor(String url) throws Exception {
        Document mainpage = Jsoup.connect(url).get();
        Element link2 = mainpage.select("div.main-news_super_item a").first();
        String url1 = link2.absUrl("href");

        Document doc = Jsoup.connect(url1).get();
        Element link3 = doc.select("a[href*=author]").first();
        String url2 = link3.absUrl("href");

        Document author = Jsoup.connect(url2).get();
        return author.select("h1").text();
    }

    public String getDate(String url) throws Exception {
        Document mainpage= Jsoup.connect(url).get();
        Element link2 = mainpage.select("div.main-news_super_item a").first();
        String url1 = link2.absUrl("href");

        Document doc1 = Jsoup.connect(url1).get();
        Element link4 = doc1.select("meta[itemprop=datePublished]").first();
        String getValue = link4.attr("content");

        return getValue;

        }


}