package FactoryMode.AbstractFactory.ProductImpl.IManImpl;

import FactoryMode.AbstractFactory.ProductImpl.IMan;

/**
 * @author JanYork
 * @date 2023/3/4 12:22
 * @description 产品类的具体实现类
 */
public class LiSiProduct implements IMan {
    /**
     * 产品类的抽象方法
     */
    @Override
    public void method() {
        System.out.println("LiSi --> Product");
    }
}