package FactoryMode.FactoryMethod.FactoryImpl;

import FactoryMode.FactoryMethod.IFactory;
import FactoryMode.FactoryMethod.IProduct;
import FactoryMode.FactoryMethod.ProductImpl.DrinkProduct;

/**
 * @author JanYork
 * @date 2023/3/4 11:03
 * @description 工厂实现类，创建产品：喝
 */
public class DrinkFactory implements IFactory {
    /**
     * 创建产品
     *
     * @return 产品
     */
    @Override
    public IProduct createProduct() {
        return new DrinkProduct();
    }

    /**
     * 销毁产品
     *
     * @param product 产品
     */
    @Override
    public void destroyProduct(IProduct product) {
        System.out.println("销毁产品");
    }
}