package DecoratorMode.decorator;

import DecoratorMode.Coffee;

/**
 * 抽象装饰器类，实现咖啡接口并包含一个咖啡对象的引用
 * <p>
 * BasicCoffee 与 CoffeeDecorator它们都实现了 Coffee 接口，不同的是，BasicCoffee是作为被装饰类，
 * 所以BasicCoffee无需构造器传入(注入)一个Coffee的子类。
 * <p>
 * 但是，CoffeeDecorator是作为装饰器类，所以需要有一个构在器传入一个Coffee的子类。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-06
 * @since 1.0.0
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    /**
     * 构造器，传入一个咖啡对象
     *
     * @param coffee 咖啡接口的任意子类
     */
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    /**
     * 获取装饰器咖啡的描述，虽然BasicCoffee与CoffeeDecorator都是去实现Coffee接口，
     * 但是他们的方法重写却不一样，BasicCoffee直接返回默认的描述(Coffee)和默认的价钱(2.00)
     * <p>
     * 而CoffeeDecorator需要调用构造器注入的被装饰类的getDescription()方法来获取被装饰类的描述，
     * 这样可以实现对被装饰类的描述进行装饰，然后嵌入式调用：Coffee fancyCoffee = new WithFoam(new WithSugar(new WithMilk(new BasicCoffee())));
     *
     * @return {@link String}
     */
    @Override
    public String getDescription() {
        // 获取装饰器咖啡的描述
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        //  获取装饰器咖啡的成本价格
        return decoratedCoffee.cost();
    }
}
