public class Main {
    public static void main(String[] args) {

    EventManager em = new EventManager();

        em.addEvent();
        em.bookTicket(3, "Rock Night");

        em.printSummary();
        em.getMostPopular();
    }
}