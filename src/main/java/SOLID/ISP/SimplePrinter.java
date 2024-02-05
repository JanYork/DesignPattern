package SOLID.ISP;

/**
 * 简单打印机
 * <p>
 * 因为根据接口隔离原则，将接口功能做到原子(即最小操作)级别的细分，所以可以自由
 * 组合不同的打印功能，比如可以只实现打印文本的功能，而不实现打印图片的功能。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class SimplePrinter implements Printer {
    public void print() {
        // 实现打印
    }
}
