package voyagerwoo.dp.blogalarm.subject;

import voyagerwoo.dp.blogalarm.BlogData;
import voyagerwoo.dp.blogalarm.parser.TistoryBlogDataParser;

public class TistoryBlogDataSubject extends Subject<BlogData> {
    private TistoryBlogDataParser parser;

    public TistoryBlogDataSubject(String blogUrl) {
        this.parser = new TistoryBlogDataParser(blogUrl);
    }

    protected BlogData getData() {
        return parser.getData();
    }
}
