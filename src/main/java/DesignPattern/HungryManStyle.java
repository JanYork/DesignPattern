package DesignPattern;

/**
 * @author JanYork
 * @date 2023/3/1 17:41
 * @description 设计模式之单例模式(饿汉式)
 * 优点：写法简单，在类装载的时候就完成了实例化，避免了线程同步问题(不存在线程安全问题)。
 * 缺点：在类装载的时候就完成了实例化，没有达到Lazy Loading(懒加载)的效果，如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
public class HungryManStyle {
    /**
     * 静态变量(单例对象)，类加载时就初始化对象(不存在线程安全问题)
     */
    private static final HungryManStyle INSTANCE = new HungryManStyle();

    /**
     * 私有化构造方法(防止外部new新的对象)
     */
    private HungryManStyle() {
    }

    /**
     * 提供一个静态的公有方法，直接返回INSTANCE
     *
     * @return instance（单例对象）
     */
    public static HungryManStyle getInstance() {
        return INSTANCE;
    }
}