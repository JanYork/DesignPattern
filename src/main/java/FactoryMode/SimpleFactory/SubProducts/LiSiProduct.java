package FactoryMode.SimpleFactory.SubProducts;

import FactoryMode.SimpleFactory.FactoryProduct;

/**
 * @author JanYork
 * @date 2023/3/4 10:38
 * @description 李四产品（子产品）
 */
public class LiSiProduct extends FactoryProduct {
    public LiSiProduct() {
        this.name = "李四产品";
    }

    @Override
    public void showName() {
        super.showName();
    }
}