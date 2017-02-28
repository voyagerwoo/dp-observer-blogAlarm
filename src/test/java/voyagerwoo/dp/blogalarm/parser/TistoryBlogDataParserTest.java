package voyagerwoo.dp.blogalarm.parser;

import org.junit.Before;
import org.junit.Test;
import voyagerwoo.dp.blogalarm.BlogData;

import static org.junit.Assert.assertTrue;

public class TistoryBlogDataParserTest {
    TistoryBlogDataParser parser;
    @Before
    public void setup() throws Exception {
        parser = new TistoryBlogDataParser("http://reimaginer.tistory.com/");
    }

    @Test
    public void getDataTest() throws Exception  {
        BlogData data = parser.getData();
        assertTrue(data.getTotalCount() > 0);
        assertTrue(data.getTodayCount() > 0);
        assertTrue(data.getYestdayCount() > 0);
    }
}
