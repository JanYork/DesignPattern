package FactoryMode.AbstractFactory;

import FactoryMode.AbstractFactory.ProductImpl.IAction;
import FactoryMode.AbstractFactory.ProductImpl.IMan;

/**
 * @author JanYork
 * @date 2023/3/1 18:02
 * @description 抽象工厂类
 */
public interface AbstractFactory {
    /**
     * 抽象工厂类的抽象方法(人物)
     *
     * @return IMan
     */
    IMan getIman(String name);

    /**
     * 抽象工厂类的抽象方法(动作)
     *
     * @return IAction
     */
    IAction getIaction(String type);
}