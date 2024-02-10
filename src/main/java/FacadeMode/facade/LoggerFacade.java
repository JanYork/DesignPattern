package FacadeMode.facade;

import FacadeMode.Logger.ErrorLogger;
import FacadeMode.Logger.InfoLogger;
import FacadeMode.Logger.WarningLogger;

/**
 * 日志记录器外观类
 * <p>
 * 通过LoggerFacade，我们提供了一个简单的接口来记录所有类型的日志，而内部的复杂性对客户端来说是透明的。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-10
 * @since 1.0.0
 */
public class LoggerFacade {
    private final ErrorLogger errorLogger = new ErrorLogger();
    private final WarningLogger warningLogger = new WarningLogger();
    private final InfoLogger infoLogger = new InfoLogger();

    public void logError(String message) {
        errorLogger.log(message);
    }

    public void logWarning(String message) {
        warningLogger.log(message);
    }

    public void logInfo(String message) {
        infoLogger.log(message);
    }
}

