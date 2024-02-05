package SOLID.SRP;

/**
 * 假设该类负责用户信息，包括姓名和电子邮件地址。
 * <p>
 * 该类与UserDB类进行交互，以将用户信息写入数据库，UserDB负责与数据库进行交互，User类只负责用户信息的操作和管理，此为单一职责体现。
 * <p>
 * 根据单一职责原则，该类应该只负责一个职责，即用户信息的管理，不能存在与用户信息管理无关的其他职责，例如发送电子邮件、写入数据到DB。
 * <p>
 * 错误的做法是将发送电子邮件、写入数据到DB的功能耦合在该类中，这样会导致这个类存在很多耦合和其他业务，会让整个类变得臃肿难易维护
 * 正确的做法是将这些功能抽象成独立的方法，在需要的时候调用这些方法即可。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void updateName(String newName) {
        name = newName;
    }

    public String getEmail() {
        return email;
    }

    public void updateEmail(String newEmail) {
        email = newEmail;
    }

    // ... 其他与用户信息相关的方法 ...
}
