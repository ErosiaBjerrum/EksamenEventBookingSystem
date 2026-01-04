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
            System.out.println("Der er ingen ledige billetter til " + getName() + ".");
            System.out.println("");
        } else if (tickets <= 0) {
            System.out.println("Antal billetter skal være over 0.");
            System.out.println("");
        }
        else {
            bookedTickets += tickets;
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