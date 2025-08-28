class Badge {
    public String print(Integer id, String name, String department) {
        department = department == null ? "OWNER" : department;

        if (id == null)
            return String.format("%s - %s", name, department.toUpperCase());
        department = department == null ? "OWNER" : department;
        return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }
}
