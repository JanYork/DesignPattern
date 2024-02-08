package LOD;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理学校总部员工的类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-08
 * @since 1.0.0
 */
class SchoolManager {
    /**
     * 返回学校总部所有员工
     *
     * @return {@link List}<{@link SchoolEmployee}>
     */
    public List<SchoolEmployee> getAllEmployee() {
        List<SchoolEmployee> list = new ArrayList<>();
        // 这里我们添加了5个员工到学校总部
        for (int i = 0; i < 5; i++) {
            SchoolEmployee emp = new SchoolEmployee("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 输出学校总部和学院员工信息，迪米特法则的应用
     *
     * @param sub 学院管理类
     */
    void printAllEmployee(CollegeManager sub) {
        // 获取到学院员工
        List<CollegeEmployee> list1 = sub.getAllCollegeEmployees();
        System.out.println("-----学院员工-----");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }

        // 获取到学校总部员工
        List<SchoolEmployee> list2 = this.getAllEmployee();
        System.out.println("-----学校总部员工-----");
        for (SchoolEmployee e : list2) {
            System.out.println(e.getId());
        }
    }
}
