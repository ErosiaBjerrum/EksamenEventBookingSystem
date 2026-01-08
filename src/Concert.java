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
        return "Concert: '" + getName() + "' with " + artist + " [" + genre + "]\n" +
                "Date: " + getEventDate() + "\n" +
                "Price: " + getPrice() + " kr.\n" +
                "Booked: " + getBookedTickets() + "/" + getMaxCapacity() + " tickets\n" +
                "Status: " + statusString() + "\n";
    }


}