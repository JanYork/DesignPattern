package FactoryMode.FactoryMethod.ProductImpl;

import FactoryMode.FactoryMethod.IProduct;

/**
 * @author JanYork
 * @date 2023/3/4 11:00
 * @description 产品实现类，行为：乐
 */
public class HappyProduct implements IProduct {
    @Override
    public void action() {
        System.out.println("乐");
    }
}