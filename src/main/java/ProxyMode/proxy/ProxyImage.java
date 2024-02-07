package ProxyMode.proxy;

import ProxyMode.Image;
import ProxyMode.RealImage;

public class ProxyImage implements Image {
    /**
     * 在代理类中，需要注入或者持有真实对象。
     * <p>
     * 这里是一个图片代理类，需要持有一个真实图片对象。
     */
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 重写显示图片方法，并调用真实对象的显示图片方法。
     */
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        System.out.println("ProxyImage: 代理类前置操作");
        realImage.display();
        System.out.println("ProxyImage: 代理类后置操作");
    }
}

