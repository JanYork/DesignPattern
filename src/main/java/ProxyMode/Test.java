package ProxyMode;

import ProxyMode.proxy.ProxyImage;

/**
 * 代理模式本质就是使用一个类作为中间跳板，来控制对另一个类的访问，这种方法我们经常使用，易于动态插入与扩展，Spring Aop就是动态代理模式的体现，我们称之为：切面编程。
 * <p>
 * 实际上很多时候，我们不需要自己构建一个代理类，我们可以动态地创建一个代理对象，
 * 这就是Java中动态代理的体现，如果有兴趣，读者可以尝试使用InvocationHandler(JDK动态代理)或者CGLIB(字节码生成代理)来实现动态代理。
 * <p>
 * 首次调用方法结果：<br/>
 * 加载图片 test_10mb.jpg<br/>
 * ProxyImage: 代理类前置操作<br/>
 * 显示图片 test_10mb.jpg<br/>
 * ProxyImage: 代理类后置操作<br/>
 * <p>
 * 第二次调用方法结果：<br/>
 * ProxyImage: 代理类前置操作<br/>
 * 显示图片 test_10mb.jpg<br/>
 * ProxyImage: 代理类后置操作<br/>
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-07
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像首次将从磁盘加载
        image.display();

        System.out.println("------------------");

        /*
         * ProxyImage首次尝试显示图像时，它将从磁盘加载图像。之后的显示调用将不再加载图像，因为ProxyImage已经持有了RealImage的引用。
         *
         * 图像不需要从磁盘加载两次。
         * 这样，我们可以看到代理模式如何为对另一个对象的访问提供一个中间层，以此来控制或增强这种访问。
         */
        image.display();
    }
}
