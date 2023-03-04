package FactoryMode.FactoryMethod.ProductImpl;

import FactoryMode.FactoryMethod.IProduct;

/**
 * @author JanYork
 * @date 2023/3/4 10:59
 * @description 产品实现类，行为：喝
 */
public class DrinkProduct implements IProduct {
    @Override
    public void action() {
        System.out.println("喝");
    }
}