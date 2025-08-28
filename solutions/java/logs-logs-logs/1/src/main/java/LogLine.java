import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLine {
    public String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = logLine.substring(logLine.indexOf("[") + 1,logLine.indexOf("]:"));
        return LogLevel.fromString(level);
    }

    public String getOutputForShortLog() {
        Map<LogLevel, String> map = Map.of(
                LogLevel.TRACE, "1",
                LogLevel.DEBUG, "2",
                LogLevel.INFO, "4",
                LogLevel.WARNING, "5",
                LogLevel.ERROR, "6",
                LogLevel.FATAL, "42",
                LogLevel.UNKNOWN, "0"
        );
        return map.get(getLogLevel()) + ":" + logLine.substring(logLine.indexOf("]:") + 3);
    }
    public static void main(String[] args) {
        LogLine log = new LogLine("[INF]: File deleted");
        System.out.println(log.getOutputForShortLog());
    }
}
