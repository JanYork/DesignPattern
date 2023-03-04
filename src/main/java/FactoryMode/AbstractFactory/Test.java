package FactoryMode.AbstractFactory;

import FactoryMode.AbstractFactory.ProductImpl.FactoryClient;
import FactoryMode.AbstractFactory.ProductImpl.FactoryImpl.IActionFactory;
import FactoryMode.AbstractFactory.ProductImpl.FactoryImpl.IManFactory;

/**
 * @author JanYork
 * @date 2023/3/4 12:51
 * @description 测试类
 */
public class Test {
    public static void main(String[] args) {
        FactoryClient factoryClient = new FactoryClient();
        IActionFactory iActionFactory = (IActionFactory) factoryClient.getFactory("IAction");
        iActionFactory.getIaction("play").method();
        iActionFactory.getIaction("eat").method();

        IManFactory iManFactory = (IManFactory) factoryClient.getFactory("IMan");
        iManFactory.getIman("ZhangSan").method();
        iManFactory.getIman("LiSi").method();
    }
}