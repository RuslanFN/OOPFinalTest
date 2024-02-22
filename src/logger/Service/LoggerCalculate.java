import java.util.ArrayList;
import java.util.List;

public class LoggerCalculate implements logger{
    protected List<String> logs;

    public LoggerCalculate() {
        this.logs = new ArrayList<>();
    }

    @Override
    public void log(String log) {
        logs.add(log);
    }

    public List<String> getLogs() {
        return logs;
    }
}
