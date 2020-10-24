package cn.scllll.supercat.Modules.Operation.OperationFactory;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

import java.util.List;

/**
 *
 * 封装各类无障碍操作方法
 */

public class Operations {
    private static String TAG = "Operations";

    /**
     * 在当前页面查找文字内容并点击
     *
     * @param text
     * @return 结果：成功或失败
     */
    public static boolean findTextAndClick(AccessibilityService accessibilityService, String text) {

        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityService.getRootInActiveWindow();
        if (accessibilityNodeInfo == null) {
            return false;
        }

        List<AccessibilityNodeInfo> nodeInfoList = accessibilityNodeInfo.findAccessibilityNodeInfosByText(text);
        accessibilityNodeInfo.recycle();
        if (nodeInfoList != null && !nodeInfoList.isEmpty()) {
            for (AccessibilityNodeInfo nodeInfo : nodeInfoList) {
                if (nodeInfo != null && (text.equals(nodeInfo.getText()) || text.equals(nodeInfo.getContentDescription()))) {
                    performClick(nodeInfo);
                    nodeInfo.recycle();
                    return true;
                }else if (nodeInfo != null){
                    nodeInfo.recycle();
                }
            }
        }
        return false;
    }

    /**
     * 检查viewId进行点击
     *
     * @param accessibilityService
     * @param id
     */
    public static boolean findViewIdAndClick(AccessibilityService accessibilityService, String id) {

        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityService.getRootInActiveWindow();
        if (accessibilityNodeInfo == null) {
            return false;
        }

        List<AccessibilityNodeInfo> nodeInfoList = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(id);
        accessibilityNodeInfo.recycle();
        if (nodeInfoList != null && !nodeInfoList.isEmpty()) {
            for (AccessibilityNodeInfo nodeInfo : nodeInfoList) {
                if (nodeInfo != null) {
                    performClick(nodeInfo);
                    nodeInfo.recycle();
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 检查viewId进行长按
     *
     * @param accessibilityService
     * @param id
     */
    public static boolean findViewIdAndLongClick(AccessibilityService accessibilityService, String id) {

        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityService.getRootInActiveWindow();
        if (accessibilityNodeInfo == null) {
            return false;
        }

        List<AccessibilityNodeInfo> nodeInfoList = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(id);
        accessibilityNodeInfo.recycle();
        if (nodeInfoList != null && !nodeInfoList.isEmpty()) {
            for (AccessibilityNodeInfo nodeInfo : nodeInfoList) {
                if (nodeInfo != null) {
                    performLongClick(nodeInfo);
                    nodeInfo.recycle();
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 检查viewId以及text内容并进行点击
     *
     * @param text
     * @param id
     */
    public static boolean findViewIdAndTextAndClick(AccessibilityService accessibilityService, String id, String text) {

        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityService.getRootInActiveWindow();
        if (accessibilityNodeInfo == null) {
            return false;
        }

        List<AccessibilityNodeInfo> nodeInfoList = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(id);
        accessibilityNodeInfo.recycle();
        if (nodeInfoList != null && !nodeInfoList.isEmpty()) {
            for (AccessibilityNodeInfo nodeInfo : nodeInfoList) {
                if (nodeInfo != null&&nodeInfo.getText().toString().equals(text)) {
                    performClick(nodeInfo);
                    nodeInfo.recycle();
                    return true;
                }else if (nodeInfo != null){
                    nodeInfo.recycle();
                }
            }
        }
        return false;
    }

    /**
     * 根据viewid查找edittext并粘贴内容
     *
     * @param content
     * @param id
     */
    public static boolean findViewByIdAndPasteContent(AccessibilityService accessibilityService, String id, String content) {
        AccessibilityNodeInfo rootNode = accessibilityService.getRootInActiveWindow();
        if (rootNode != null) {
            List<AccessibilityNodeInfo> editInfo = rootNode.findAccessibilityNodeInfosByViewId(id);
            rootNode.recycle();
            if (editInfo != null && editInfo.size()>0) {
                for (final AccessibilityNodeInfo node : editInfo) {
                    if (node != null && node.getClassName().equals("android.widget.EditText") && node.isEnabled()) {
                        try {
                            Thread.sleep(300);

                            Bundle arguments = new Bundle();
                            arguments.putCharSequence(AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, content);
                            node.performAction(AccessibilityNodeInfo.ACTION_SET_TEXT, arguments);

                            Thread.sleep(300);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        node.recycle();
                        return true;
                    }else if (node != null){
                        node.recycle();
                    }
                }
            }
            return false;
        }
        return false;
    }

    /**
     * 根据viewID查找view，读取并返回其text值
     *
     * @param id
     */
    public static String findTextById(AccessibilityService accessibilityService, String id) {
        AccessibilityNodeInfo rootInfo = accessibilityService.getRootInActiveWindow();
        if (rootInfo != null) {
            List<AccessibilityNodeInfo> userNames = rootInfo.findAccessibilityNodeInfosByViewId(id);
            rootInfo.recycle();
            if (userNames != null && userNames.size() > 0) {
                for (AccessibilityNodeInfo node : userNames){
                    if (node != null ){
                        String name = node.getText().toString();
                        node.recycle();
                        return name;
                    }

                }
            }
        }
        return null;
    }

    /**
     * 在当前页面查找对话框文字内容并点击
     *
     * @param text1 默认点击text1
     * @param text2
     */
    public static void findDialogAndClick(AccessibilityService accessibilityService, String text1, String text2) {

        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityService.getRootInActiveWindow();
        if (accessibilityNodeInfo == null) {
            return;
        }
        List<AccessibilityNodeInfo> dialogWait = accessibilityNodeInfo.findAccessibilityNodeInfosByText(text1);
        List<AccessibilityNodeInfo> dialogConfirm = accessibilityNodeInfo.findAccessibilityNodeInfosByText(text2);
        accessibilityNodeInfo.recycle();
        if (!dialogWait.isEmpty() && !dialogConfirm.isEmpty()) {
            for (AccessibilityNodeInfo nodeInfo : dialogWait) {
                if (nodeInfo != null && text1.equals(nodeInfo.getText())) {
                    performClick(nodeInfo);
                    nodeInfo.recycle();
                    break;
                }else if(nodeInfo != null){
                    nodeInfo.recycle();
                }
            }
        }

    }

    //模拟点击事件
    public static void  performClick(AccessibilityNodeInfo nodeInfo) {
        if (nodeInfo == null) {
            return;
        }
        if (nodeInfo.isClickable()) {
            nodeInfo.performAction(AccessibilityNodeInfo.ACTION_CLICK);
        } else {
            performClick(nodeInfo.getParent());
        }
    }

    public static void performLongClick(AccessibilityNodeInfo nodeInfo) {
        if (nodeInfo == null) {
            return;
        }
        if (nodeInfo.isClickable()) {
            nodeInfo.performAction(AccessibilityNodeInfo.ACTION_LONG_CLICK);
            Log.i(TAG,"True perform Long click.");
        } else {
            performLongClick(nodeInfo.getParent());
        }
    }

    //模拟返回事件
    public static boolean performBack(AccessibilityService service) {
        if (service == null) {
            return false;
        }
        service.performGlobalAction(AccessibilityService.GLOBAL_ACTION_BACK);
        return true;
    }

    public static boolean performHome(AccessibilityService service){
        if (service == null) {
            return false;
        }
        service.performGlobalAction(AccessibilityService.GLOBAL_ACTION_HOME);
        return true;
    }

    /**
     * 获取当前界面的windowInfo
     */
    public static AccessibilityNodeInfo getWindowInfo(AccessibilityService accessibilityService ){
        AccessibilityNodeInfo rootInfo = accessibilityService.getRootInActiveWindow();
        return rootInfo;
    }

    public static boolean gestureAction(AccessibilityService service, Path path, int startTime, int duration){
        GestureDescription description = new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path,startTime,duration,false)).build();
        boolean state =  service.dispatchGesture(description, new AccessibilityService.GestureResultCallback() {
            @Override
            public void onCompleted(GestureDescription gestureDescription) {
                super.onCompleted(gestureDescription);

            }

            @Override
            public void onCancelled(GestureDescription gestureDescription) {
                super.onCancelled(gestureDescription);
                Log.i(TAG,"Gesture onCancelled!"+gestureDescription.toString());
            }
        },null);
        return state;
    }

    public static void getWindowsInfo(AccessibilityService service){
        List<AccessibilityWindowInfo> list = service.getWindows();
        for (AccessibilityWindowInfo info :list){
            Rect rect = new Rect();
            info.getBoundsInScreen(rect);
            Log.i(TAG,info.getId() + info.getTitle().toString() +info.getType()+" node size is: "+rect.width()+" ,"+rect.height());
        }
    }
}
