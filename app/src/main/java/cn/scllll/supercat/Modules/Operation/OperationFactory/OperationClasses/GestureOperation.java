package cn.scllll.supercat.Modules.Operation.OperationFactory.OperationClasses;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Path;
import android.util.Log;

import com.google.gson.JsonObject;

import cn.scllll.supercat.Modules.Operation.OperationFactory.BaseOperation;
import cn.scllll.supercat.Modules.Operation.OperationFactory.OperationID;
import cn.scllll.supercat.Modules.Operation.OperationFactory.Operations;

public class GestureOperation extends BaseOperation {
    private final static String TAG = "GestureOperation";
    private Path path;
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private int startTime = 500;
    private int duration = 100;
    private int operation_id;
    private int repeatTimes = 1;

    public GestureOperation(){
        super(OperationID.GESTURE_ACTION);
    }

    public GestureOperation add(int x,int y){
        this.startX = x;
        this.startY = y;
        return this;
    }

    public GestureOperation add(int startX,int startY,int endX,int endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        return this;
    }

    public GestureOperation setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public GestureOperation setStartTime(int startTime){
        this.startTime = startTime;
        return this;
    }

    public GestureOperation setRepeat(int times){
        this.repeatTimes = times;
        return this;
    }

    @Override
    public boolean run(AccessibilityService service) {
        Path _path = new Path();
        switch (operation_id){
            case CLICK:
                _path.moveTo(startX,startY);
                _path.lineTo(startX,startY);
                for (int i = 0; i < repeatTimes ;i++){
                    if (!Operations.gestureAction(service,_path,startTime,duration)){
                        return false;
                    }
                }
                return true;
            case LONG_CLICK:
                _path.moveTo(startX,startY);
                _path.lineTo(startX,startY);
                duration = 2000;
                return Operations.gestureAction(service,_path,startTime,duration);
            case SCROLL:
                _path.moveTo(startX,startY);
                _path.lineTo(endX,endY);
                duration = 1000;
                return Operations.gestureAction(service,_path,startTime,duration);
            default:
                Log.e(TAG,"Unrecognize method id");
                return false;
        }
    }

    public GestureOperation select(int operation_id){
        this.operation_id = operation_id;
        return this;
    }


    public static final int CLICK = 1;
    public static final int LONG_CLICK = 2;
    public static final int SCROLL = 3;

}
