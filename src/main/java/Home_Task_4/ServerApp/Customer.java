package Home_Task_4.ServerApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static Home_Task_4.UserApp.Input.inputDouble;

public class Customer {
    private List<Ticket> tickets;
    private User user;
    private TicketProvider ticketProvider;
    private CashProvider cashProvider;

    public Customer(User user) {
        this.user = user;
        this.cashProvider = new CashProvider(this.user);
        this.ticketProvider = new TicketProvider();
    }

    public void byuTicket(long routeNum, int place, LocalDateTime localDateTime){
        this.tickets = new ArrayList<>();
        Ticket myTicket = ticketProvider.getTicket(routeNum, place ,localDateTime);
        if (myTicket == null){
            System.out.println("No such ticket " + myTicket.toString());
            System.out.println();
        }
        if (myTicket.isValid()) {
//            double price = inputPrice(myTicket);
            double price = myTicket.getPrice();
            this.cashProvider.payment(price);
            this.tickets.add(myTicket);
            this.ticketProvider.updateTicketList(myTicket);
        } else if (myTicket.isValid() == false) {
            System.out.println(myTicket.toString());
            System.out.println();
        }
    }

    public User getUser() {
        return user;
    }
    public void showAvailbleTickets(){
        List <Ticket> list = this.ticketProvider.getTicketList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isValid() == true) {
                System.out.print(i+1);
                System.out.println(" " + list.get(i));
            }
        }
    }
    public List<Ticket> getTickets(){
        return this.ticketProvider.getTicketList();
    }

    private boolean checkPriceOfInput(Ticket ticket, double price){
        if (price == ticket.getPrice()) return true;
        else return false;
    }
    private double inputPrice(Ticket ticket){
        double price = inputDouble("Enter price of Ticket");
        if (checkPriceOfInput(ticket, price)){
            return price;
        }else {
            System.out.println("Wrong price of Ticket. Try again");
            double price_2 = inputDouble("Enter price of Ticket");
            return price_2;
        }
    }
    public void setTicketsList(List <Ticket> newTicketsList){
        this.ticketProvider.setTicketList(newTicketsList);
    }
}
