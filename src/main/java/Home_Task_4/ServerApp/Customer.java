package Home_Task_4.ServerApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Ticket> tickets;
    private User user;
    private TicketProvider ticketProvider;
    private CashProvider cashProvider;

    public Customer() {
        //this.user = new User();
        this.cashProvider = new CashProvider(this.user);
        this.ticketProvider = new TicketProvider();
    }

    public void byuTicket(int routeNum, LocalDateTime localDateTime){
        Ticket myTicket = ticketProvider.getTicket(routeNum, localDateTime);
        this.cashProvider.payment(myTicket.getPrice());
        this.tickets.add(myTicket);
        this.ticketProvider.updateTicketList(myTicket);
    }

}
