public class LogLevels {
    
    public static String message(String logLine) {
        String message = String.format("\r%s", logLine.substring(logLine.indexOf("]") + 3));
        return message.trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        String level = logLevel(logLine);
        String message = message(logLine);
        return message + " (" + level + ")";
    }
}
