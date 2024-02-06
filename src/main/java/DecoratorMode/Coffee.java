package DecoratorMode;

/**
 * 咖啡接口，定义了获取描述和成本的方法
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-06
 * @since 1.0.0
 */
public interface Coffee {
    /**
     * 获取描述
     *
     * @return {@link String}
     */
    String getDescription();

    /**
     * 获取成本
     *
     * @return double
     */
    double cost();
}
