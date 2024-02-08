package LOD;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理学院员工的类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-08
 * @since 1.0.0
 */
class CollegeManager {
    /**
     * 返回所有的学院员工
     *
     * @return {@link List}<{@link CollegeEmployee}>
     */
    public List<CollegeEmployee> getAllCollegeEmployees() {
        List<CollegeEmployee> list = new ArrayList<>();
        // 这里我们添加了10个员工到学院
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }
}
