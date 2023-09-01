package Home_Task_4.ServerApp;

import java.time.LocalDateTime;

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
    public void Ticket(long routeNum, double price, int place, LocalDateTime localDateTime, boolean isValid){
        this.routeNumber = routeNum;
        this.price = price;
        this.place = place;
        this.dateTime = localDateTime;
        this.isValid = isValid;


    }
}