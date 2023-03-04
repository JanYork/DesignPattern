package FactoryMode.AbstractFactory.ProductImpl.FactoryImpl;

import FactoryMode.AbstractFactory.AbstractFactory;
import FactoryMode.AbstractFactory.ProductImpl.IAction;
import FactoryMode.AbstractFactory.ProductImpl.IMan;
import FactoryMode.AbstractFactory.ProductImpl.IManImpl.JanYorkProduct;
import FactoryMode.AbstractFactory.ProductImpl.IManImpl.LiSiProduct;
import FactoryMode.AbstractFactory.ProductImpl.IManImpl.ZhangSanProduct;

/**
 * @author JanYork
 * @date 2023/3/4 12:34
 * @description 产品类的具体工厂类(人物)
 */
public class IManFactory implements AbstractFactory {
    /**
     * 抽象工厂类的抽象方法(人物)
     *
     * @param name 人物名称
     * @return IMan
     */
    @Override
    public IMan getIman(String name) {
        switch (name) {
            case "ZhangSan":
                return new ZhangSanProduct();
            case "LiSi":
                return new LiSiProduct();
            case "JanYork":
                return new JanYorkProduct();
        }
        return null;
    }

    /**
     * 抽象工厂类的抽象方法(动作)
     * 忽视此方法，因为人物工厂类不需要动作工厂类的方法
     *
     * @param type 动作类型
     * @return IAction
     */
    @Override
    public IAction getIaction(String type) {
        return null;
    }
}