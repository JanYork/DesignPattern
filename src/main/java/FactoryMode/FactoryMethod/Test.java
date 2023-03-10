package FactoryMode.FactoryMethod;

import FactoryMode.FactoryMethod.FactoryImpl.DrinkFactory;
import FactoryMode.FactoryMethod.FactoryImpl.EatFactory;
import FactoryMode.FactoryMethod.FactoryImpl.HappyFactory;
import FactoryMode.FactoryMethod.FactoryImpl.PlayFactory;

/**
 * @author JanYork
 * @date 2023/3/4 11:05
 * @description
 */
public class Test {
    public static void main(String[] args) {
        //ε
        IFactory eatFactory = new EatFactory();
        IProduct eatProduct = eatFactory.createProduct();
        eatProduct.action();

        //ε
        IFactory drinkFactory = new DrinkFactory();
        IProduct drinkProduct = drinkFactory.createProduct();
        drinkProduct.action();

        //η©
        IFactory playFactory = new PlayFactory();
        IProduct playProduct = playFactory.createProduct();
        playProduct.action();

        //δΉ
        IFactory happyFactory = new HappyFactory();
        IProduct happyProduct = happyFactory.createProduct();
        happyProduct.action();
    }
}