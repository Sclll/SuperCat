package cn.scllll.supercat.Modules.Operation.OperationFactory;

public class OperationFactory {
    private static final String TAG = "OperationFactory";
    public static <T extends BaseOperation> T create(Class<T> cls){
        BaseOperation operation = null;
        try {
            operation = (BaseOperation) Class.forName(cls.getName()).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)operation;
    }
}
