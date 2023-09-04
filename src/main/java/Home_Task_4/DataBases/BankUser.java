package Home_Task_4.DataBases;

import Home_Task_4.ServerApp.User;

public class BankUser {
    private String name;
    private String surname;
    private long cardNumber;
    private double balance;
    public BankUser(String name, String surname, long cardNumber, double balance){
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean equals(User user){
        if (this.name.equals(user.getName()) && this.surname.equals(user.getSurname()) &&
                this.cardNumber == user.getCardNumber()){
            return true;
        }else
            return false;
    }
}
