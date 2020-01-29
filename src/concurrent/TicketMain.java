package concurrent;

public class TicketMain {

    public static void main(String... args) {
        TicketWindow ticketWindow1 = new TicketWindow("一号出号机");
        TicketWindow ticketWindow2 = new TicketWindow("二号出号机");
        TicketWindow ticketWindow3 = new TicketWindow("三号出号机");
        TicketWindow ticketWindow4 = new TicketWindow("四号出号机");
        ticketWindow1.start();
        ticketWindow2.start();
        ticketWindow3.start();
        ticketWindow4.start();
    }
}
