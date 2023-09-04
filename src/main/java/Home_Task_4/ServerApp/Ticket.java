package Home_Task_4.ServerApp;

import java.time.LocalDateTime;
import java.time.chrono.Chronology;

public class Ticket {
    private long routeNumber;
    private double price;
    private int place;
    private LocalDateTime dateTime;
    private boolean isValid;



    public long getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(long routeNumber) {
        this.routeNumber = routeNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
    public Ticket(long routeNumber, double price, int place, LocalDateTime dateTime, boolean isValid){
        this.routeNumber = routeNumber;
        this.price = price;
        this.place = place;
        this.dateTime = dateTime;
        this.isValid = isValid;

    }

    @Override
    public String toString(){
        String ticket = "Route Number-" + this.routeNumber
                        + "; Price-" + this.price + "; Place-" + this.place
                        + "; Date and Local Time:" + this.dateTime;
        if (this.isValid == true){
            return ticket + "; Available";
        }
        else
            return ticket + "; Not Available";
    }

    public boolean equals(long routeNumber, int place, LocalDateTime localDateTime){
        int orginDate = this.dateTime.getYear() + this.dateTime.getMonthValue() + this.dateTime.getDayOfMonth() +
                        this.dateTime.getHour() + this.dateTime.getMinute();
        int otherDate = localDateTime.getYear() + localDateTime.getMonthValue() +
                        localDateTime.getDayOfMonth() + localDateTime.getHour() + localDateTime.getMinute();
        if (this.routeNumber == routeNumber && this.place == place && orginDate == otherDate){
            return true;
        }
        return false;
    }
    public boolean equals (Ticket ticket){
        long routeNumber = ticket.getRouteNumber();
        int place = ticket.getPlace();
        LocalDateTime localDateTime = ticket.getDateTime();
        if (equals(routeNumber, place, localDateTime)){
            return true;
        }
        return false;
    }
}
