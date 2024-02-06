package DecoratorMode.decorator;

import DecoratorMode.Coffee;

/**
 * 加奶泡装饰器
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-06
 * @since 1.0.0
 */
public class WithFoam extends CoffeeDecorator {
    public WithFoam(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        //  返回被装饰者的描述加上当前装饰器的描述
        return decoratedCoffee.getDescription() + "加奶泡, ";
    }

    @Override
    public double cost() {
        // 加奶泡的额外成本
        return decoratedCoffee.cost() + 0.40;
    }
}
