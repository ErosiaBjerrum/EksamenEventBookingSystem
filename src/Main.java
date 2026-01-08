public class Main {
    public static void main(String[] args) {

    EventManager em = new EventManager();

        em.addEvent();
        em.bookTicket(3, "Rock ight");
        em.bookTicket(3, "Rock Night");
        em.bookTicket(5, "Java Basics");
        em.getMostPopular();
        em.printSummary();
    }
}