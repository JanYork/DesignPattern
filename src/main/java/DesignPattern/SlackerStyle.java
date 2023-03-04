package DesignPattern;

/**
 * @author JanYork
 * @date 2023/3/1 17:33
 * @description 设计模式之单例模式(懒汉式)
 * 优点：延迟加载，效率较高。
 * 缺点：线程不安全，可能会造成多个实例。
 */
public class SlackerStyle {
    private static SlackerStyle instance;

    /**
     * 私有化构造方法(防止外部new新的对象)
     */
    private SlackerStyle() {
    }

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去创建instance
     * 即懒汉式
     *
     * @return instance（单例对象）
     */
    public static SlackerStyle getInstance() {
        if (instance == null) {
            instance = new SlackerStyle();
        }
        return instance;
    }
}