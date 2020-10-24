package cn.scllll.supercat.Modules.Operation.OperationFactory;

import android.accessibilityservice.AccessibilityService;

import com.google.gson.JsonObject;

public abstract class BaseOperation {
    private int method_id;
    private boolean optional = false;
    private int delay = 2000;

    public BaseOperation(int method_id){
        this.method_id = method_id;
    }


    public boolean isOptional(){
        return optional;
    }

    public BaseOperation setOptional(boolean optional) {
        this.optional = optional;
        return this;
    }

    public BaseOperation setDelay(int delay) {
        this.delay = delay;
        return this;
    }

    public int getDelay() {
        return delay;
    }

    public abstract boolean run(AccessibilityService service);
}
