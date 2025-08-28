public enum LogLevel {
    TRACE("TRC"),
    DEBUG("DBG"),
    INFO("INF"),
    WARNING("WRN"),
    ERROR("ERR"),
    FATAL("FTL"),
    UNKNOWN("*");
    private final String label;
    LogLevel(String label) {
        this.label = label;
    }

    public static LogLevel fromString(String text) {
        for (LogLevel b : LogLevel.values()) {
            if (b.label.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return UNKNOWN;
    }
}
