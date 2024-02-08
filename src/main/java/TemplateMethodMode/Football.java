package TemplateMethodMode;

/**
 * Football类继承自Game，具体实现了足球游戏的逻辑
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-08
 * @since 1.0.0
 */
class Football extends Game {
    // 实现初始化游戏的具体操作。
    @Override
    void initialize() {
        System.out.println("足球游戏初始化...");
    }

    // 实现开始游戏的具体操作。
    @Override
    void startPlay() {
        System.out.println("足球游戏开始...");
    }

    // 实现结束游戏的具体操作。
    @Override
    void endPlay() {
        System.out.println("足球游戏结束...");
    }
}
