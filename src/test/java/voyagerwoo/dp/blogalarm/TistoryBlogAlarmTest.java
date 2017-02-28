package voyagerwoo.dp.blogalarm;

import org.junit.Test;
import voyagerwoo.dp.blogalarm.observer.BlogDataLogger;
import voyagerwoo.dp.blogalarm.subject.TistoryBlogDataSubject;

import java.util.Timer;
import java.util.TimerTask;

public class TistoryBlogAlarmTest {
    @Test
    public void checkInterval() throws Exception {
        final TistoryBlogDataSubject subject = new TistoryBlogDataSubject("http://reimaginer.tistory.com/");

        subject.registerObserver(new BlogDataLogger());

        Timer timer = new Timer();
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                subject.notifyObserver();
            }
        }, 500, 3000); //0.5초 뒤에 3초 단위로 반복

        try {
            Thread.sleep(6000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }

        timer.cancel();
    }
}
