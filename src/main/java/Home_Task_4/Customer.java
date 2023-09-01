package Home_Task_4;

import Home_Task_4.ServerApp.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public class Customer {
    private int id;
    private List<Ticket> tickets;
    private CashProvider cash;
    public boolean buyTicket(Ticket ticket){
        return true;
    }
    public Ticket search(LocalDateTime localDateTime, long routeNumber){
        for (int i = 0; i < this.tickets.size(); i++){
            if (this.tickets.get(i).getRouteNumber() == routeNumber && this.tickets.get(i).getDateTime() == localDateTime){
                return this.tickets.get(i);
            }
        }return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public CashProvider getCash() {
        return cash;
    }

    public void setCash() {
        this.cash = new CashProvider();
    }
}
