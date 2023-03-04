package FactoryMode.SimpleFactory.SubProducts;

import FactoryMode.SimpleFactory.FactoryProduct;

/**
 * @author JanYork
 * @date 2023/3/4 10:37
 * @description 张三产品（子产品）
 */
public class ZhangSanProduct extends FactoryProduct {
    public ZhangSanProduct() {
        this.name = "张三产品";
    }

    @Override
    public void showName() {
        super.showName();
    }
}