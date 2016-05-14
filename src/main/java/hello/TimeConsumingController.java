package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class TimeConsumingController {

    @RequestMapping("/longtask")
    public String longRunningTask() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("Starting a long running task ");
        TimeUnit.SECONDS.sleep(8);
        System.out.println("Completed a long running task ");
        return "Completed a heavyweight task and took " + (System.currentTimeMillis() - startTime) + "ms";
    }
}
