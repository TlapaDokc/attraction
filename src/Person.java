public class Person {
    protected String name;
    protected String lastName;
    protected int ticets;

    public Person(String name, String lastName, int ticets) {
        this.name = name;
        this.lastName = lastName;
        this.ticets = ticets;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    public int wasted() {
        ticets--;
        return ticets;
    }
}
