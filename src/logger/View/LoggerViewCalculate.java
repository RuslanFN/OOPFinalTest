public class LoggerViewCalculate implements loggerView {
    protected logger logger;

    public LoggerViewCalculate(logger logger) {
        this.logger = logger;
    }

    @Override
    public void printLog() {
        {
            int i = 1;
            for (String log : logger.getLogs()) {
                System.out.println(i++ + ") " + log);
            }
        }
    }
}
