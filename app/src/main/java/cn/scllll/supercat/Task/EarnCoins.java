package cn.scllll.supercat.Task;

import cn.scllll.supercat.Modules.Operation.OperationBuilder;
import cn.scllll.supercat.Modules.Operation.OperationFactory.OperationClasses.GestureOperation;
import cn.scllll.supercat.Modules.Operation.OperationFactory.OperationClasses.GlobalAction;
import cn.scllll.supercat.Modules.Operation.OperationFactory.OperationFactory;

public class EarnCoins {
    public static OperationBuilder earnCoinsHighResolution(){
        OperationBuilder builder = OperationBuilder.create()
                .next(OperationFactory.create(GestureOperation.class).add(500,1200).select(GestureOperation.CLICK).setStartTime(1).setDuration(50).setRepeat(200).setDelay(200))
                .next(OperationFactory.create(GestureOperation.class).add(900,2050).select(GestureOperation.CLICK).setDelay(2000))

                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))

                .next(OperationFactory.create(GestureOperation.class).add(900,1600).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1600).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))

                .next(OperationFactory.create(GestureOperation.class).add(900,1050).select(GestureOperation.CLICK).setDelay(2000))
                .next(OperationFactory.create(GestureOperation.class).add(900,1050).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                
                .next(OperationFactory.create(GestureOperation.class).add(560,920).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GestureOperation.class).add(750,920).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GestureOperation.class).add(930,920).select(GestureOperation.CLICK).setDelay(25000))

                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_HOME));
        return builder;
    }

    public static OperationBuilder earnCoinsNormalResolution(){
        OperationBuilder builder = OperationBuilder.create()
                .next(OperationFactory.create(GestureOperation.class).add(500,900).select(GestureOperation.CLICK).setStartTime(1).setDuration(50).setRepeat(200).setDelay(200))
                .next(OperationFactory.create(GestureOperation.class).add(900,1850).select(GestureOperation.CLICK).setDelay(2000))

                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1250).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))

                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))
                .next(OperationFactory.create(GestureOperation.class).add(900,1420).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))

                .next(OperationFactory.create(GestureOperation.class).add(900,1050).select(GestureOperation.CLICK).setDelay(2000))
                .next(OperationFactory.create(GestureOperation.class).add(900,1050).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_BACK))

                .next(OperationFactory.create(GestureOperation.class).add(560,915).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GestureOperation.class).add(750,915).select(GestureOperation.CLICK).setDelay(25000))
                .next(OperationFactory.create(GestureOperation.class).add(930,915).select(GestureOperation.CLICK).setDelay(25000))

                .next(OperationFactory.create(GlobalAction.class).add(GlobalAction.ACTION_HOME));
        return builder;
    }
}
