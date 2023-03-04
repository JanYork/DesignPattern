package FactoryMode.AbstractFactory.ProductImpl;

import FactoryMode.AbstractFactory.AbstractFactory;
import FactoryMode.AbstractFactory.ProductImpl.FactoryImpl.IActionFactory;
import FactoryMode.AbstractFactory.ProductImpl.FactoryImpl.IManFactory;

/**
 * @author JanYork
 * @date 2023/3/4 12:52
 * @description 工厂客户端(因为工厂抽象有多个实现类 ， 所以这里使用客户端来调用)
 */
public class FactoryClient {
    /**
     * 根据传入的工厂名字来获取工厂
     *
     * @param factoryName 工厂名字
     * @return AbstractFactory
     */
    public AbstractFactory getFactory(String factoryName) {
        switch (factoryName) {
            case "IMan":
                return new IManFactory();
            case "IAction":
                return new IActionFactory();
            default:
                return null;
        }
    }
}