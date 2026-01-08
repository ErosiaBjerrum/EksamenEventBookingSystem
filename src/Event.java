import java.time.LocalDate;

public abstract class Event {
    private String name;
    private LocalDate eventDate;
    private double price;
    private int maxCapacity;
    private int bookedTickets;

    public Event(String name, LocalDate eventDate, double price,
                 int maxCapacity, int bookedTickets) {
        this.name = name;
        this.eventDate = eventDate;
        this.price = price;
        this.maxCapacity = maxCapacity;
        this.bookedTickets = bookedTickets;
    }

    public void addBooking (int tickets) {
        if (isSoldOut() || bookedTickets + tickets > maxCapacity) {
            System.out.println("No available tickets for " + getName() + ".\n");
        } else if (tickets <= 0) {
            System.out.println("Booked tickets must be more than 0.\n");
        }
        else {
            bookedTickets += tickets;
            System.out.println("You have booked " + tickets + " tickets for the event " + name + ".\n");
        }
    }

    public boolean isSoldOut() {
        if (bookedTickets >= maxCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public String statusString () {
        if (isSoldOut()) {
            return "SOLD OUT";
        } else {
            return "Available";
        }
    }

    public String getName() {
        return name;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getBookedTickets() {
        return bookedTickets;
    }

    public abstract String getInfo();
}