import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Parser {

    String url;

    public Parser(String url) {
        this.url = url;
    }

    public Document getNewsPage() throws Exception {
        Document mainpage = Jsoup.connect(url).get();
        Element link2 = mainpage.select("div.main-news_super_item a").first();
        String url1 = link2.absUrl("href");

        return Jsoup.connect(url1).get();
    }

    public String getTitle() throws Exception {
        Document doc = getNewsPage();
        return doc.select("h1").text();
    }

    public String getAuthor() throws Exception {
        Document doc = getNewsPage();
        return doc.select("a[href*=author]").text();
    }

    public String getDate() throws Exception {
        Document doc = getNewsPage();
        return doc.select("meta[itemprop=datePublished]").attr("content");
    }

    public String getArticle() throws Exception {
        Document doc = getNewsPage();
        return doc.select("p").text();
    }
}