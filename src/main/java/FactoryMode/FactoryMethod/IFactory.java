package FactoryMode.FactoryMethod;

/**
 * @author JanYork
 * @date 2023/3/4 10:48
 * @description 工厂接口，定义工厂的基本功能，如创建产品，销毁产品等
 */
public interface IFactory {
    /**
     * 创建产品
     *
     * @return 产品
     */
    IProduct createProduct();

    /**
     * 销毁产品
     *
     * @param product 产品
     */
    void destroyProduct(IProduct product);
}