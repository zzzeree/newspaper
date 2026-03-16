public class Main {

    public static void main(String[] args) throws Exception {

        Link link = new Link();

        String url = "https://tengrinews.kz/";

        String title = link.getTitle(url);
        System.out.println(title);

        String authorName = link.getAuthor(url);
        System.out.println(authorName);

        String date = link.getDate(url);
        System.out.println(date);

    }
}