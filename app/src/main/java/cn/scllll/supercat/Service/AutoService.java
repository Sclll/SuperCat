package cn.scllll.supercat.Service;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import cn.scllll.supercat.Bean.EventState;
import cn.scllll.supercat.Modules.Operation.OperationBuilder;
import cn.scllll.supercat.Task.EarnCoins;

public class AutoService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {

    }

    @Override
    public void onInterrupt() {

    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void onMessageEvent(EventState state){
        OperationBuilder builder;
        switch (state.id){
            case 1:
                builder = EarnCoins.earnCoinsNormalResolution();
                builder.setService(this);
                builder.build();
                break;
            case 2:
                builder = EarnCoins.earnCoinsHighResolution();
                builder.setService(this);
                builder.build();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        EventBus.getDefault().register(this);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        EventBus.getDefault().unregister(this);
        return super.onUnbind(intent);
    }
}
