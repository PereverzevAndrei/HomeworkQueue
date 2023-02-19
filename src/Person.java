public class Person {
    private String firstName;
    private String lastName;
    private int tickets;

    public Person(String firstName, String lastName, int tickets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
