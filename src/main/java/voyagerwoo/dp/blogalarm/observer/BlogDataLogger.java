package voyagerwoo.dp.blogalarm.observer;

import voyagerwoo.dp.blogalarm.BlogData;

public class BlogDataLogger implements Observer<BlogData>, Logger<BlogData> {
    public void log(BlogData data) {
        System.out.println("블로그 통계 정보");
        System.out.println("My today count : " + data.getTodayCount());
        System.out.println("My yesterday count :" + data.getYestdayCount());
        System.out.println("My total count : " + data.getTotalCount());
        System.out.println("My recent count : " + data.getRecentComment());
        System.out.println();
    }

    public void update(BlogData data) {
        log(data);
    }
}
