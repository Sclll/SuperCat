package cn.scllll.supercat.Util;

import androidx.annotation.IntRange;

public class DelayUtil {
    public static void shortDelay(){
        customerDelay(500);
    }

    public static void longDelay(){
        customerDelay(1000);
    }

    public static void longlongDelay(){
        customerDelay(4000);
    }

    public static void customerDelay(@IntRange(from=1,to=30000) int millSeconds){
        try {
            Thread.sleep(millSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
