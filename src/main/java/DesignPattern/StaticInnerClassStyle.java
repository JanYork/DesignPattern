package DesignPattern;

/**
 * @author JanYork
 * @date 2023/3/1 17:38
 * @description 设计模式之单例模式(静态内部类模式)
 * 优点：线程安全，延迟加载，效率较高。
 * 缺点：写法复杂，不够优雅。
 */
public class StaticInnerClassStyle {
    /**
     * 私有化构造方法(防止外部new新的对象)
     */
    private StaticInnerClassStyle() {
    }

    /**
     * 静态内部类
     */
    private static class SingletonInstance {
        // 静态内部类中的静态变量(单例对象)
        private static final StaticInnerClassStyle INSTANCE = new StaticInnerClassStyle();
    }

    /**
     * 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
     *
     * @return instance（单例对象）
     */
    public static StaticInnerClassStyle getInstance() {
        return SingletonInstance.INSTANCE;
    }
}