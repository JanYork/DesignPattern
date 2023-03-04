package FactoryMode.AbstractFactory.ProductImpl.IManImpl;

import FactoryMode.AbstractFactory.ProductImpl.IMan;

/**
 * @author JanYork
 * @date 2023/3/4 12:21
 * @description 产品类的具体实现类
 */
public class JanYorkProduct implements IMan {
    /**
     * 产品类的抽象方法
     */
    @Override
    public void method() {
        System.out.println("JanYork --> Product");
    }
}
