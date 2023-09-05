package Home_Task_4.DataBases;

import Home_Task_4.ServerApp.Ticket;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class TicketDataBase{
    private List<Ticket> ticketList;
    public void addTicket(Ticket ticket){
        this.ticketList.add(ticket);
    }
    public TicketDataBase(){
       this.ticketList = defaultTickeetList();
    }
    public List<Ticket> getTicketList(){
        return this.ticketList;
    }

    private List<Ticket> defaultTickeetList(){
        List<Ticket> defaultTicketList = new ArrayList<>();

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
        defaultTicketList.add(ticket_1);
        defaultTicketList.add(ticket_2);
        defaultTicketList.add(ticket_3);
        defaultTicketList.add(ticket_4);
        defaultTicketList.add(ticket_5);
        return this.ticketList = defaultTicketList;
    }
    public void updateTicketDatabaseList(Ticket ticket){
        for (int i = 0; i < this.ticketList.size(); i++) {
            if (this.ticketList.get(i).equals(ticket)){
                this.ticketList.get(i).setValid(false);
            }
        }
    }
    public void setTicketList(List<Ticket> ticketList){
        this.ticketList = ticketList;
    }

}
