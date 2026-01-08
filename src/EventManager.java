import java.time.LocalDate;
import java.util.ArrayList;

public class EventManager {
    ArrayList<Event> events = new ArrayList<>();

    public void addEvent() {

        events.add(new Concert(
                "Rock Night",
                LocalDate.of(2025, 5, 15),
                1000,
                300,
                300,
                "Elvis",
                "Rock 'n Roll"
        ));

        events.add(new Concert(
                "Jazz Evening",
                LocalDate.of(2025, 8, 22),
                750,
                200,
                198,
                "Miles Davis",
                "Jazz"
        ));

        events.add(new Workshop(
                "Java Basics",
                LocalDate.of(2025, 3, 12),
                1200,
                25,
                10,
                "Anders Jensen",
                "Object-Oriented Programming",
                false
        ));

        events.add(new Workshop(
                "Web Development Bootcamp",
                LocalDate.of(2025, 9, 5),
                1500,
                30,
                18,
                "Maria Hansen",
                "HTML, CSS, and JavaScript",
                true
        ));
    }

    public void bookTicket (int tickets, String name) {
        boolean found = false;
            for (Event event : events) {
                if (event.getName().equals(name)) {
                    event.addBooking(tickets);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Event does not exist.\n");
            }
    }

    public void printSummary() {
        System.out.println("=== Event Overview ===\n");
        for (Event event : events) {
            System.out.println(event.getInfo());
        }
    }

    public void getMostPopular () {
        Event mostBooked = events.get(0);
        for (Event event : events) {
            if (event.getBookedTickets() > mostBooked.getBookedTickets()) {
                mostBooked = event;
            }
        }
        System.out.println("Most popular event: " + mostBooked.getName() + " " + "(" + mostBooked.getBookedTickets() + " bookings" + ")\n");
    }
}