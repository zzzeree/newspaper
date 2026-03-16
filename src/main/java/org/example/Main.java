public class Main {

    public static void main(String[] args) throws Exception {

        String url = "https://tengrinews.kz/";
        Parser link = new Parser(url);

        System.out.println(link.getTitle());
        System.out.println(link.getAuthor());
        System.out.println(link.getDate());
        System.out.println(link.getArticle());

    }
}