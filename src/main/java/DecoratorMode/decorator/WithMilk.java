package DecoratorMode.decorator;

import DecoratorMode.Coffee;

/**
 * 牛奶装饰器
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-06
 * @since 1.0.0
 */
public class WithMilk extends CoffeeDecorator {
    /**
     * 构造器注入咖啡装饰器接口
     *
     * @param coffee 咖啡装饰器接口的任意子类
     */
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // 返回被装饰的Coffee的描述加上当前装饰器的描述
        return decoratedCoffee.getDescription() + "加牛奶, ";
    }

    @Override
    public double cost() {
        // 加牛奶的额外成本
        return decoratedCoffee.cost() + 0.80;
    }
}

