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
        return "Workshop: '" + getName() + "' by " + instructor + " [" + topic + "]\n" +
                "Date: " + getEventDate() + "\n" +
                "Price: " + getPrice() + " kr.\n" +
                "Booked: " + getBookedTickets() + "/" + getMaxCapacity() + " tickets\n" +
                "Materials included: " + hasMaterials() + "\n" +
                "Status: " + statusString() + "\n";
    }

    public String hasMaterials () {
        if (materials == true) {
            return "Yes";
        } else {
            return "No";
        }
    }
}