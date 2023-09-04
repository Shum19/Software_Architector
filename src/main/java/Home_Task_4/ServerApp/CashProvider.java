package Home_Task_4.ServerApp;

import Home_Task_4.DataBases.BankUser;
import Home_Task_4.DataBases.CashProviderDataBase;

import java.util.ArrayList;
import java.util.List;

public class CashProvider {
    private String name;
    private String surname;
    private long cardNumber;
    private double balance;
    private BankUser bankUser;
    private CashProviderDataBase cashProviderDataBase = new CashProviderDataBase();// список базы данных в банке

    public CashProvider(User user){
        if (authorization(user)){
            this.bankUser = cashProviderDataBase.getBankUser(user);
            this.name = this.bankUser.getName();
            this.surname = this.bankUser.getSurname();
            this.cardNumber = this.bankUser.getCardNumber();
            this.balance = this.bankUser.getBalance();
        }else
            System.out.println("Not Authorized");
    }

    // Метод обнавляет баланс после оплаты
    private void updateBalance(double price){
        double curBalance = this.balance;
        this.balance = curBalance - price;
    }
    // Метод проверяет баланс на банковском счете и если средств хватает то будет проиизведена оплата
    private boolean checkBalance(double price){
        double currentBalance = this.balance;
        if (currentBalance > price)
            return true;
        else
            return false;
    }
    private boolean authorization(User user){
        for (int i = 0; i < cashProviderDataBase.getUserList().size(); i++) {
            if (cashProviderDataBase.getUserList().get(i).equals(user)){
                return true;
            }
        }
        return false;
    }


    public void payment(double price){
        if (checkBalance(price)){
            updateBalance(price);
            System.out.println("Your payment is done");
        }
    }

}
