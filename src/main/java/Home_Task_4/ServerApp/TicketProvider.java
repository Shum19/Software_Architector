package Home_Task_4.ServerApp;

import Home_Task_4.ServerApp.Ticket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    private List <Ticket> ticketList;
    public TicketProvider(){
        this.ticketList = getTicketList();
    }

    // Метод для получиня списка билетов из базы данных
    private List<Ticket> getTicketList(){
        return this.ticketList = new ArrayList<>();
    }
    public Ticket getTicket (long routeNum, LocalDateTime localDateTime){
        getTicketList();
        for (int i = 0; i < ticketList.size(); i++){
            Ticket ticket = ticketList.get(i);
            if (ticket.getRouteNumber() == routeNum && ticket.getDateTime() == localDateTime){
                return ticket;
            }
        }
        return null;
    }
    public void updateTicketList(Ticket ticket){
        this.ticketList.remove(getTicket(ticket.getRouteNumber(), ticket.getDateTime()));
    }


}
