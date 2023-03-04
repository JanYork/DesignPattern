package DesignPattern;

/**
 * @author JanYork
 * @date 2023/3/1 17:54
 * @description 设计模式之单例模式(枚举单例)
 * 优点：避免序列化和反序列化攻击破坏单例，避免反射攻击破坏单例(枚举类型构造函数是私有的)，线程安全，延迟加载，效率较高。
 * 缺点：代码复杂度较高。
 */
public enum EnumerateSingletons {
    /**
     * 枚举单例
     */
    INSTANCE;

    public void whateverMethod() {
        // TODO：do something ，在这里实现单例对象的功能
    }
}