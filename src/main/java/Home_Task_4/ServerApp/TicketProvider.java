package Home_Task_4.ServerApp;

import Home_Task_4.DataBases.TicketDataBase;
import Home_Task_4.ServerApp.Ticket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    private List <Ticket> ticketList;
    private TicketDataBase ticketDataBase = new TicketDataBase();
    public TicketProvider(){
        this.ticketList = ticketDataBase.getTicketList();
    }

    // Метод для получиня списка билетов из базы данных
    public List<Ticket> getTicketList(){
        return this.ticketList;
    }
    public Ticket getTicket (long routeNum, int place, LocalDateTime localDateTime){
        for (int i = 0; i < this.ticketList.size(); i++){
            if (this.ticketList.get(i).equals(routeNum, place, localDateTime)){
                return this.ticketList.get(i);
            }
        }
        return null;
    }
    public void updateTicketList(Ticket ticket){
        this.ticketDataBase.updateTicketDatabaseList(ticket);
        this.ticketList = this.ticketDataBase.getTicketList();
    }
    public void setTicketList(List<Ticket> newTicketList){
        this.ticketList = newTicketList;
    }


}
