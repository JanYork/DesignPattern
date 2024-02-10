package FacadeMode;

import FacadeMode.facade.LoggerFacade;

/**
 * 外观模式测试类
 * <p>
 * LoggerFacade作为外观，简化了客户端与复杂日志系统之间的交互。客户端仅需通过LoggerFacade即可完成对日志系统的所有操作，
 * 而无需直接与底层的日志记录子系统交互。这种设计提高了代码的可用性和可维护性，同时也降低了客户端与系统内部组件之间的耦合度。
 * <p>
 * 外观模式是一种设计模式，用于为复杂的系统提供一个简单的接口。通过这种方式，外观模式帮助隐藏系统的复杂性，使得客户端在使用功能时只需要与一个统一的接口交互，
 * 而不必直接与系统的复杂结构打交道。这样不仅减少了系统的依赖，也使得客户端的使用变得更加简单。
 * <p>
 * 假设我们有一个日志系统，它包括三个级别的日志记录：错误日志、警告日志和信息日志。每个级别的日志记录都由不同的子系统处理。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-10
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        LoggerFacade logger = new LoggerFacade();

        logger.logError("print log.");
        logger.logWarning("print log.");
        logger.logInfo("print log.");
    }
}
