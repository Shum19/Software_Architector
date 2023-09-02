package Home_Task_4.DataBases;

import Home_Task_4.ServerApp.Ticket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicketDataBase {
    public static void main(String[] args) {
        Ticket ticket_1 = new Ticket();
        ticket_1.setRouteNumber(23);
        ticket_1.setPrice(320.00);
        ticket_1.setPlace(1);
        ticket_1.setDateTime(LocalDateTime.of(2023, 9, 01,17,40));

        Ticket ticket_2 = new Ticket();
        ticket_2.setRouteNumber(23);
        ticket_2.setPrice(320.00);
        ticket_2.setPlace(2);
        ticket_2.setDateTime(LocalDateTime.of(2023, 9, 01,17,40));

        Ticket ticket_3 = new Ticket();
        ticket_3.setRouteNumber(23);
        ticket_3.setPrice(320.00);
        ticket_3.setPlace(3);
        ticket_3.setDateTime(LocalDateTime.of(2023, 9, 01,17,40));

        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(ticket_1);
        ticketList.add(ticket_2);
        ticketList.add(ticket_3);
        System.out.println(ticketList);
    }


}
