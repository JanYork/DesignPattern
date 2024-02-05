package SOLID.SRP;

/**
 * 假设该类负责与数据库进行交互，包括添加、删除和更新用户信息等操作。
 * <p>
 * 根据SRP原则，该类应该仅负责与数据库相关的职责，而不应该负责用户对象的创建和操作等职责。
 * 因此，应该将创建用户对象和操作用户对象的职责分离到不同的类中。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class UserDB {
    public void addUserToDatabase(User user) {
        // 将用户添加到数据库
    }

    public void deleteUserFromDatabase(User user) {
        // 从数据库中删除用户
    }

    // ... 其他与数据库操作相关的方法 ...
}
