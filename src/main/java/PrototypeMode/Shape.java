package PrototypeMode;

/**
 * 抽象形状类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-07
 * @since 1.0.0
 */
abstract class Shape implements Cloneable {
    /**
     * 形状类型
     */
    protected String type;

    /**
     * 绘画方法
     */
    abstract void draw();

    /**
     * 克隆方法
     *
     * @return {@link Object}
     */
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
