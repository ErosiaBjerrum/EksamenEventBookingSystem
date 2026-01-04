import java.time.LocalDate;

public class Concert extends Event {
    private String artist;
    private String genre;

    public Concert(String name, LocalDate eventDate, double price,
                   int maxCapacity, int bookedTickets, String artist, String genre) {
        super(name, eventDate, price, maxCapacity, bookedTickets);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String getInfo() {
        System.out.println("Concert: " + "''" + getName() + "''" + " with " + artist + " [" + genre + "]");
        System.out.println("Date: " + getEventDate());
        System.out.println("Price: " + getPrice() + " kr.");
        System.out.println("Booked: " + getBookedTickets() + "/" + getMaxCapacity() + " tickets");
        System.out.println("Status: " + statusString());
        System.out.println("");
        return "";
    }

}