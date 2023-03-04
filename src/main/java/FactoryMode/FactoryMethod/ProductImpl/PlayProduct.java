package FactoryMode.FactoryMethod.ProductImpl;

import FactoryMode.FactoryMethod.IProduct;

/**
 * @author JanYork
 * @date 2023/3/4 10:59
 * @description 产品实现类，行为：玩
 */
public class PlayProduct implements IProduct {

    /**
     * 产品行为
     */
    @Override
    public void action() {
        System.out.println("玩");
    }
}