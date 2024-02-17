package BuilderMode;

import BuilderMode.builder.Computer;

/**
 * Builder模式测试类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-17
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 返回Builder对象
        Computer.Builder builder = new Computer.Builder()
                .CPU("Intel i9")
                .RAM("32GB")
                .storage("1TB SSD");

        // Builder对象可以后续自由补充属性，而构造出来的对象不可修改
        builder.operatingSystem("Windows 11");

        // 构建Computer对象
        Computer computer1 = builder.build();

        // 使用Builder模式构建Computer对象，该对象不可修改，只可以获取属性
        Computer computer2 = new Computer.Builder()
                .CPU("Intel i7")
                .RAM("16GB")
                .storage("500G SSD")
                .operatingSystem("Windows 10")
                .build();

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}
