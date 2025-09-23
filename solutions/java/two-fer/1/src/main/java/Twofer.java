public class Twofer {
    public String twofer(String name) {
        return new StringBuilder()
            .append("One for ")
            .append(name == null ? "you" : name)
            .append(", one for me.").toString();
        }
}
