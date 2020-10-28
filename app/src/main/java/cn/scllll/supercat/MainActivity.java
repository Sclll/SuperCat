package cn.scllll.supercat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;

import cn.scllll.supercat.Bean.EventState;
import cn.scllll.supercat.Util.CheckService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startTB = findViewById(R.id.startTB);
        Button startJD = findViewById(R.id.startJD);
        Button stop = findViewById(R.id.stop);

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);//getWindowManager()
        int displayWidth=dm.widthPixels;
        int dispalyHeight=dm.heightPixels;
        Log.i("test",displayWidth + " * " + dispalyHeight);

        startTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckService.checkIsOn(MainActivity.this)){
                    Toast.makeText(MainActivity.this,"自动操作将在30s后开始，请将切换至淘宝的超级星秀猫页面。",Toast.LENGTH_LONG).show();
                    if (dispalyHeight>1800 && dispalyHeight <2000) {
                        EventBus.getDefault().post(new EventState(1));
                    }else if (dispalyHeight >=2000 && dispalyHeight < 2500) {
                        EventBus.getDefault().post(new EventState(2));
                    }else {
                        Toast.makeText(MainActivity.this,"暂不支持您的手机分辨率。",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        startJD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckService.checkIsOn(MainActivity.this)){
                    Toast.makeText(MainActivity.this,"自动操作将在30s后开始，请将切换至京东双十一大赢家页面。",Toast.LENGTH_LONG).show();
                    if (dispalyHeight>1800 && dispalyHeight <2000) {
                        EventBus.getDefault().post(new EventState(3));
                    }else if (dispalyHeight >=2000 && dispalyHeight < 2500) {
                        EventBus.getDefault().post(new EventState(4));
                    }else {
                        Toast.makeText(MainActivity.this,"暂不支持您的手机分辨率。",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new EventState(0));
            }
        });
    }
}