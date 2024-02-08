package LOD;

/**
 * 迪米特法则案例
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-08
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        // 打印所有员工
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
