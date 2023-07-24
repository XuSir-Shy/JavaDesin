package design.CreationalPattern.FactoryMethodPattern;

public class Test {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new FileLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
