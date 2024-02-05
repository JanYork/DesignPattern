package SOLID.DIP;

/**
 * 此处的TEST相当于Spring中的Service层或者其他高层次模块。
 * 它依赖于低层次的模块（DataRepository）。
 * <p>
 * 注入的是一个抽象接口，而不是具体的实现类。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class Test {
    /**
     * 注入抽象接口，而不是具体的实现类，这样可以方便地替换不同的实现类。
     */
    private final DataRepository repository;

    /**
     * 传入不同的实现类。
     *
     * @param repository 实现类，DataRepository是抽象接口，传入它的任意子类。
     */
    public Test(DataRepository repository) {
        this.repository = repository;
    }

    public void save() {
        // 调用子类实现的存储方法
        repository.saveReport("JanYork");
    }

    public static void main(String[] args) {
        SqlDataRepository sqlDataRepository = new SqlDataRepository();
        HbaseDataRepository hbaseDataRepository = new HbaseDataRepository();

        // 传入不同的实现类
        Test test1 = new Test(sqlDataRepository);

        // 调用存储方法
        test1.save(); // 结果：保存报告到SQL数据库: JanYork

        Test test2 = new Test(hbaseDataRepository);

        test2.save(); // 结果：保存报告到Hbase数据库: JanYork
    }
}
