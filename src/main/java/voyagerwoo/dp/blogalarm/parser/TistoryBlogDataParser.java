package voyagerwoo.dp.blogalarm.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import voyagerwoo.dp.blogalarm.BlogData;

import java.io.IOException;

public class TistoryBlogDataParser {
    private String blogUrl;
    public TistoryBlogDataParser(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public BlogData getData() {
        try {
            Document doc = Jsoup.connect(blogUrl).get();
            int total = convertToInt( doc.select(".list_total dd").text() );
            int today = convertToInt( doc.select(".list_visitor dd").get(0).text() );
            int yesterday = convertToInt( doc.select(".list_visitor dd").get(1).text() );
            String comment = doc.select(".box_aside").get(2).select("li").last().text();

            return new BlogData(total, today, yesterday, comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int convertToInt(String string) {
        string = string.replaceAll(",", "");
        try {
            return Integer.parseInt(string);
        } catch(Exception e) {}
        return 0;
    }
}
