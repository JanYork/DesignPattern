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
        //吃
        IFactory eatFactory = new EatFactory();
        IProduct eatProduct = eatFactory.createProduct();
        eatProduct.action();

        //喝
        IFactory drinkFactory = new DrinkFactory();
        IProduct drinkProduct = drinkFactory.createProduct();
        drinkProduct.action();

        //玩
        IFactory playFactory = new PlayFactory();
        IProduct playProduct = playFactory.createProduct();
        playProduct.action();

        //乐
        IFactory happyFactory = new HappyFactory();
        IProduct happyProduct = happyFactory.createProduct();
        happyProduct.action();
    }
}