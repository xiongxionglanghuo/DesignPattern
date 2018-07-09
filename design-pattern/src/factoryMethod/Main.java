package factoryMethod;

/**
 * @Author: wujiapeng
 * @Description: 工厂方法模式
 * @Date: created in 15:15 2018/7/9
 */
public class Main {

    /**
     * 工厂方法模式是对简单工厂模式的优化，将系统内部的判断逻辑上浮到客户端，让客户端自己选择需要创建哪个类型的对象
     *
     * 之前的简单工厂如果需要进行多次相同的运算操作，需要创建多个对象，如果此刻需要进行修改这些操作，每个都需要修改。然而工厂方法就可以避免这个问题，只需要修改一处就可以了。
     *
     * 其实不管是工厂方法还是简单工厂，都是需要针对的业务场景进行选择，并没有优劣之分。工厂方法模式就是将判断逻辑抽象成不同的类，让客户端进行选择
     *
     * 策略模式里面就包含了这些思想，其实搞懂策略，这些也就没有什么问题了
     *
     * ps: 抽象工厂模式跟工厂方法模式很类似，区别在于抽象工程模式更"抽象"，只有接口相互依赖，而不是直接new AddOperationFactory;
     *
     * @param args
     */
    public static void main(String[] args) {
        OperationFactory operationFactory = new AddOperationFactory(1.0f, 2.0f);
        System.out.println(operationFactory.getResult());
    }
}
