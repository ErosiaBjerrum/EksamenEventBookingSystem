import java.time.LocalDate;

public class Workshop extends Event {
    private String instructor;
    private String topic;
    private boolean materials;

    public Workshop(String name, LocalDate eventDate, double price, int maxCapacity,
                    int bookedTickets, String instructor, String topic, boolean materials) {
        super(name, eventDate, price, maxCapacity, bookedTickets);
        this.instructor = instructor;
        this.topic = topic;
        this.materials = materials;
    }

    @Override
    public String getInfo() {
        System.out.println("Workshop: " + "''" + getName() + "''" + " by " + instructor + " [" + topic + "]");
        System.out.println("Date: " + getEventDate());
        System.out.println("Price: " + getPrice() + " kr.");
        System.out.println("Booked: " + getBookedTickets() + "/" + getMaxCapacity() + " tickets");
        System.out.println("Materials included: " + hasMaterials());
        System.out.println("Status: " + statusString());
        System.out.println("");

        return "";
    }

    public String hasMaterials () {
        if (materials == true) {
            return "Yes";
        } else {
            return "No";
        }
    }
}