package FactoryMode.SimpleFactory;

/**
 * @author JanYork
 * @date 2023/3/4 10:31
 * @description 工厂生产的产品主类(父类 / 接口 / 抽象类)，所有产品都继承自该类
 */
public abstract class FactoryProduct {
    //TODO：可以在这里定义产品的公共属性和方法，如下：
    public String name;

    public void showName() {
        System.out.println("产品名称：" + name);
    }
}