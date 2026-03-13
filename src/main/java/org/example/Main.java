import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main{
    public static void main (String[] args) throws Exception{

        Document mainpage = Jsoup.connect("https://tengrinews.kz/").get();

        Element link = mainpage.select("div.main-news_super_item a").first();
        String url = link.absUrl("href");
        Document doc = Jsoup.connect(url).get();
        System.out.println(doc.select("h1").text());

        Element link2 = doc.select("a[href*=author]").first();
        String url2 = link2.absUrl("href");
        Document author = Jsoup.connect(url2).get();
        System.out.println(author.select("h1").text());
    }
}