package TemplateMethodMode;

/**
 * 定义一个抽象类Game，作为所有游戏的基类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-08
 * @since 1.0.0
 */
abstract class Game {
    /**
     * 模板方法playGame()，定义了游戏运行的算法骨架。
     * 它是final的，以防止子类修改算法的结构。
     */
    final void playGame() {
        initialize();  // 初始化游戏
        startPlay();   // 开始游戏
        endPlay();     // 结束游戏
    }

    // 定义三个步骤为抽象方法，具体实现将由子类完成。

    /**
     * 初始化游戏的抽象方法。
     */
    abstract void initialize();

    /**
     * 开始游戏的抽象方法。
     */
    abstract void startPlay();

    /**
     * 结束游戏的抽象方法。
     */
    abstract void endPlay();
}
