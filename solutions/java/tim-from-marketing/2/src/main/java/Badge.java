class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder sb = new StringBuilder();
        department = department == null ? "OWNER" : department;

        if (id == null)
            return sb.append(name).append(" - ").append(department.toUpperCase()).toString();
        department = department == null ? "OWNER" : department;
        return sb.append("[").append(id).append("] ").append(name).append(" - ").append(department.toUpperCase()).toString();
    }
}
