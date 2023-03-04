package DesignPattern;

/**
 * @author JanYork
 * @date 2023/3/1 17:42
 * @description 设计模式之单例模式(双重检查锁模式)，线程安全，推荐使用
 * 优点：线程安全，延迟加载，效率较高，在保证线程安全的情况下，也可以实现延迟加载。
 * 缺点：代码复杂度较高。
 */
public class DoubleLockStyle {
    /**
     * volatile关键字，使得instance变量在多个线程间可见，禁止指令重排序优化
     * volatile是一个轻量级的同步机制，即轻量锁
     */
    private static volatile DoubleLockStyle instance;

    /**
     * 私有化构造方法(防止外部new新的对象)
     */
    private DoubleLockStyle() {
    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
     * 即双重检查锁模式
     *
     * @return instance（单例对象）
     */
    public static DoubleLockStyle getInstance() {
        if (instance == null) {
            // 同步代码块，线程安全的创建实例
            synchronized (DoubleLockStyle.class) {
                //之所以要再次判断，是因为可能有多个线程同时进入了第一个if判断
                if (instance == null) {
                    instance = new DoubleLockStyle();
                }
            }
        }
        return instance;
    }
}