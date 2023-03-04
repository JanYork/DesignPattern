package FactoryMode.AbstractFactory.ProductImpl.FactoryImpl;

import FactoryMode.AbstractFactory.AbstractFactory;
import FactoryMode.AbstractFactory.ProductImpl.IAction;
import FactoryMode.AbstractFactory.ProductImpl.IActionImpl.EatProduct;
import FactoryMode.AbstractFactory.ProductImpl.IActionImpl.PlayProduct;
import FactoryMode.AbstractFactory.ProductImpl.IMan;

/**
 * @author JanYork
 * @date 2023/3/4 12:38
 * @description 产品类的抽象工厂类(动作)
 */
public class IActionFactory implements AbstractFactory {

    /**
     * 抽象工厂类的抽象方法(人物)
     * 忽视此方法，因为动作工厂类不需要人物工厂类的方法
     *
     * @param name 人物名称
     * @return IMan
     */
    @Override
    public IMan getIman(String name) {
        return null;
    }

    /**
     * 抽象工厂类的抽象方法(动作)
     *
     * @param type 动作类型
     * @return IAction
     */
    @Override
    public IAction getIaction(String type) {
        switch (type) {
            case "eat":
                return new EatProduct();
            case "play":
                return new PlayProduct();
        }
        return null;
    }
}