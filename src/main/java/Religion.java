public class Religion {
    String name;
    String origin;
    int numberOfFollowers;
    public Religion(String name, String origin, int numberOfFollowers) {
        this.name = name;
        this.origin = origin;
        this.numberOfFollowers = numberOfFollowers;
    }

    public String describe() {
        return name + " started in " + origin + " and has " + numberOfFollowers/1000000 + " million followers";
    }
}
