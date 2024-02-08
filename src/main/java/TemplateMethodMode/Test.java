package TemplateMethodMode;

/**
 * 模版方法主要是依赖抽象类中的抽象方法，子类实现这些抽象方法，完成自己的逻辑。
 * <p>
 * playGame是抽象类中的方法，他调用内部的抽象方法，完成游戏的逻辑的编排，至于实现就交给子类类。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-08
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 创建Cricket游戏实例，并运行游戏。
        Game game = new Cricket();
        game.playGame(); // 使用模板方法

        // 创建Football游戏实例，并运行游戏。
        game = new Football();
        game.playGame(); // 使用模板方法
    }
}
