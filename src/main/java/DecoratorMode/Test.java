package DecoratorMode;

import DecoratorMode.decorator.WithFoam;
import DecoratorMode.decorator.WithMilk;
import DecoratorMode.decorator.WithSugar;
import DecoratorMode.decorator.BasicCoffee;

/**
 * 装饰器本质是将装饰器类与被装饰器类进行组合，通过装饰器类对被装饰器类进行包装，以达到增强被装饰器类功能的目的。
 * <p>
 * 此处BasicCoffee是咖啡的被装饰类，作为咖啡，你可以不放糖，不放牛奶，不放奶泡，但是你不能不放咖啡，所以BasicCoffee是基本的必须的类。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-06
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 制作基础咖啡
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " Cost: ¥" + basicCoffee.cost());

        // 制作加牛奶的咖啡
        Coffee milkCoffee = new WithMilk(new BasicCoffee());
        System.out.println(milkCoffee.getDescription() + " Cost: ¥" + milkCoffee.cost());

        // 制作加糖、牛奶和奶泡的咖啡
        Coffee fancyCoffee = new WithFoam(new WithSugar(new WithMilk(new BasicCoffee())));
        System.out.println(fancyCoffee.getDescription() + " Cost: ¥" + fancyCoffee.cost());
    }
}
