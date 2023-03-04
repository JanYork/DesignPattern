package FactoryMode.AbstractFactory.ProductImpl.IActionImpl;

import FactoryMode.AbstractFactory.ProductImpl.IAction;

/**
 * @author JanYork
 * @date 2023/3/4 12:27
 * @description 产品类的具体实现类
 */
public class EatProduct implements IAction {
    /**
     * 产品类的抽象方法
     */
    @Override
    public void method() {
        System.out.println("吃");
    }
}
