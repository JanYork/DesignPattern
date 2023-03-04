package FactoryMode.SimpleFactory;

import FactoryMode.SimpleFactory.SubProducts.JanYorkProduct;
import FactoryMode.SimpleFactory.SubProducts.LiSiProduct;
import FactoryMode.SimpleFactory.SubProducts.ZhangSanProduct;

/**
 * @author JanYork
 * @date 2023/3/1 18:01
 * @description 简单工厂模式
 */
public class SimpleFactory {
    /**
     * 简单工厂模式
     *
     * @param name 产品名称
     * @return 产品
     */
    public FactoryProduct createProduct(String name) {
        // 产品父类
        FactoryProduct product;
        //分支判断创建子产品对象 TODO：IF改为使用SWITCH会更好，灵活更改使用即可
        if ("张三".equals(name)) {
            // 产品子类，此处体限Java的多态性
            product = new ZhangSanProduct();
        } else if ("李四".equals(name)) {
            // 同上
            product = new LiSiProduct();
        } else if ("JanYork".equals(name)) {
            // 同上
            product = new JanYorkProduct();
        } else {
            return null;
        }
        return product;
    }
}