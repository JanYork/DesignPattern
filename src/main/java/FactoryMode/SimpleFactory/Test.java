package FactoryMode.SimpleFactory;

/**
 * @author JanYork
 * @date 2023/3/4 10:45
 * @description 测试类
 */
public class Test {
    public static void main(String[] args) {
        //TODO：测试工厂类
        SimpleFactory factory = new SimpleFactory();
        //TODO：工厂生产产品
        FactoryProduct product = factory.createProduct("JanYork");
        //TODO：产品展示自己的名字
        product.showName();
    }
}