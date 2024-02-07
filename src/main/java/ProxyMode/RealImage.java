package ProxyMode;

/**
 * 图片接口实现(真实图片)
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-07
 * @since 1.0.0
 */
public class RealImage implements Image {
    private final String fileName;

    /**
     * 注入图片名称
     *
     * @param fileName 图片名称
     */
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    /**
     * 重写显示图片方法
     */
    @Override
    public void display() {
        System.out.println("显示图片 " + fileName);
    }

    /**
     * 私有方法，模拟从磁盘加载图片
     *
     * @param fileName 图片名称
     */
    private void loadFromDisk(String fileName) {
        System.out.println("加载图片 " + fileName);
    }
}

