package voyagerwoo.dp.blogalarm;

public class BlogData {
    private int totalCount;
    private int todayCount;
    private int yestdayCount;
    private String recentComment;

    public BlogData(int totalCount, int todayCount, int yestdayCount, String recentComment) {
        this.totalCount = totalCount;
        this.todayCount = todayCount;
        this.yestdayCount = yestdayCount;
        this.recentComment = recentComment;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getTodayCount() {
        return todayCount;
    }

    public int getYestdayCount() {
        return yestdayCount;
    }

    public String getRecentComment() {
        return recentComment;
    }
}
