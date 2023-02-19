import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>(generateClients());

        while (!attraction.isEmpty()) {
            Person person = attraction.poll();
            int tickets = person.getTickets() - 1;
            System.out.println(person.getFirstName() + " " + person.getLastName() + " прокатился на аттракционе, и у него осталось " + person.getTickets() + " билетов.");
            person.setTickets(tickets);
            if (tickets > 0) {
                attraction.add(person);
            }
        }
    }

    private static List<Person> generateClients() {

        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Иван", "Гирин", 2));
        list.add(new Person("Энгельберт", "Хемпердинк", 1));
        list.add(new Person("Родион", "Майс", 3));
        list.add(new Person("Вениамин", "Дериповский", 5));
        list.add(new Person("Зырян", "Квасов", 7));

        return list;
    }
}
