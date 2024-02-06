package DecoratorMode.decorator;

import DecoratorMode.Coffee;

/**
 * 加糖装饰器
 * 装饰器继承自CoffeeDecorator(咖啡装饰器抽象类)，并持有被装饰的Coffee对象
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-06
 * @since 1.0.0
 */
public class WithSugar extends CoffeeDecorator {
    /**
     * 注入咖啡装饰器接口的任意子类
     *
     * @param coffee 咖啡装饰器任意子类
     */
    public WithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        //  返回被装饰的Coffee的描述加上当前装饰器的描述
        return decoratedCoffee.getDescription() + "加糖, ";
    }

    @Override
    public double cost() {
        // 加上加糖的额外成本
        return decoratedCoffee.cost() + 0.50;
    }
}
