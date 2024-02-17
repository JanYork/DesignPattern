package BuilderMode.builder;

/**
 * Computer类，用于演示Builder模式
 * <p>
 * 在Builder模式中，Computer类的构造函数是私有的，
 * 只能通过公开的内部类Builder类来构建Computer实例中的字段，然后在Computer类的构造函数中传入构建好的对象并进行赋值。
 * <p>
 * 建造者模式是一种创建型模式，它用来构建一个复杂的对象。在这种模式中，构建过程被分解成多个简单的步骤，
 * 并且这些步骤可以通过一个统一的接口完成。建造者模式使得构建过程和表示过程分离，这样同样的构建过程可以创建不同的表示。
 *
 * <ul>
 *     <li>构建一个对象时，需要提供多种配置选项。</li>
 *     <li>创建一个复杂对象（特别是那些包含多个部分或子对象的对象），希望有一个清晰的方式来构建它。</li>
 * </ul>
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-17
 * @since 1.0.0
 */
public class Computer {
    // Computer类的属性定义
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String operatingSystem;

    /* ----------------- 以下为Getter模式的实现 ----------------- */

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    /* ----------------- 以上为Builder模式的实现 ----------------- */

    /**
     * 私有构造函数，只能通过Builder类构建Computer实例
     *
     * @param builder 传入的Builder对象
     */
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.operatingSystem = builder.operatingSystem;
    }

    /**
     * 静态内部类Builder，用于逐步构建Computer对象
     *
     * @author JanYork
     * @version 1.0.0
     * @date 2024-02-17
     * @since 1.0.0
     */
    public static class Builder {
        // Builder类中的属性与Computer类相同
        private String CPU;
        private String RAM;
        private String storage;
        private String operatingSystem;

        public Builder() {
            // 初始化操作（如果需要的话）
        }

        // 设置CPU并返回当前Builder对象，实现链式调用
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        // 设置RAM并返回当前Builder对象
        public Builder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        // 设置存储并返回当前Builder对象
        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        // 设置操作系统并返回当前Builder对象
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // 构建最终的Computer对象
        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer {" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}

