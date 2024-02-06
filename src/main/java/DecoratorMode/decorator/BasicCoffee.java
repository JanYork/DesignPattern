package DecoratorMode.decorator;

import DecoratorMode.Coffee;

/**
 * 基础咖啡类，实现咖啡接口
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-06
 * @since 1.0.0
 */
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee：";
    }

    @Override
    public double cost() {
        // 基础咖啡的成本
        return 2.00;
    }
}
