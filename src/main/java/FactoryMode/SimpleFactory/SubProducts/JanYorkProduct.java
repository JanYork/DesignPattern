package FactoryMode.SimpleFactory.SubProducts;

import FactoryMode.SimpleFactory.FactoryProduct;

/**
 * @author JanYork
 * @date 2023/3/4 10:35
 * @description JanYork产品（子产品）
 */
public class JanYorkProduct extends FactoryProduct {
    public JanYorkProduct() {
        this.name = "JanYork产品";
    }

    @Override
    public void showName() {
        super.showName();
    }
}