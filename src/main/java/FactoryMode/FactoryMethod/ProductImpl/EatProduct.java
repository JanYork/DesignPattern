package FactoryMode.FactoryMethod.ProductImpl;

import FactoryMode.FactoryMethod.IProduct;

/**
 * @author JanYork
 * @date 2023/3/4 10:55
 * @description 产品实现类，行为：吃
 */
public class EatProduct implements IProduct {
    @Override
    public void action() {
        System.out.println("吃");
    }
}