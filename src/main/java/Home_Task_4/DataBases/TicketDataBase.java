package Home_Task_4.DataBases;

import Home_Task_4.ServerApp.Ticket;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicketDataBase {
    private List<Ticket> ticketList;
    public void addTicket(Ticket ticket){
        this.ticketList.add(ticket);
    }
    public List<Ticket> getTicketList(){
        return defaultTickeetList();
    }

    private List<Ticket> defaultTickeetList(){
        this.ticketList = new ArrayList<>();

        Ticket ticket_1 = new Ticket(1, 320.00, 1,
                                        LocalDateTime.of(2023, 9, 03, 17,30), true );
        Ticket ticket_2 = new Ticket(1, 320.00, 2,
                                        LocalDateTime.of(2023, 9, 03, 17,30), true );
        Ticket ticket_3 = new Ticket(1, 320.00, 3,
                                        LocalDateTime.of(2023, 9, 03, 17,30), true );
        Ticket ticket_4 = new Ticket(1, 320.00, 4,
                                        LocalDateTime.of(2023, 9, 03, 17,30), true );
        Ticket ticket_5 = new Ticket(1, 300.00, 5,
                                        LocalDateTime.of(2023, 9, 03, 17,30), true );
        this.ticketList.add(ticket_1);
        this.ticketList.add(ticket_2);
        this.ticketList.add(ticket_3);
        this.ticketList.add(ticket_4);
        this.ticketList.add(ticket_5);
        return this.ticketList;
    }


}
