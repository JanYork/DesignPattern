package SOLID.ISP;

/**
 * 多功能打印机
 * <p>
 * 因为根据接口隔离原则，将接口功能做到原子(即最小操作)级别的细分，所以可以自由
 * 组合不同的打印功能，实现多功能打印机。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class MultiFunctionMachine implements Printer, Scanner, Copier {
    public void print() {
        // 实现打印
    }

    public void scan() {
        // 实现扫描
    }

    public void copy() {
        // 实现复印
    }
}
