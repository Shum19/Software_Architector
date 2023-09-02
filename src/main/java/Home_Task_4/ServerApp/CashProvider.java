package Home_Task_4.ServerApp;

import java.util.ArrayList;
import java.util.List;

public class CashProvider {
    private String name;
    private String surname;
    private long cardNumber;
    private double balance;
    private List<CashProvider> cashProviderList = new ArrayList<>();// список базы данных в банке

    public CashProvider(User user){
        String name = user.getName();
        String surname = user.getSurname();
        long cardNum = user.getCardNumber();
        if (authorization(name, surname, cardNum)){
            this.name = name;
            this.surname = surname;
            this.cardNumber = cardNum;
            this.balance = getBalance();
        }else
            System.out.println("Not Authorized");
    }



    // Метод используеться для получения баланса на банковском счете
    private double getBalance(){
        return this.balance;
    }
    // Метод обнавляет баланс после оплаты
    private void updateBalance(double price){
        double curBalance = getBalance();
        this.balance = curBalance - price;
    }
    // Метод проверяет баланс на банковском счете и если средств хватает то будет проиизведена оплата
    private boolean checkBalance(double price){
        double currentBalance = getBalance();
        if (currentBalance > price)
            return true;
        else
            return false;
    }
    private boolean authorization(String name, String surname, long cardNumber){
        for (int i = 0; i < cashProviderList.size(); i++) {
            CashProvider cashProvider = cashProviderList.get(i);
            if (cashProvider.name == name && cashProvider.surname == surname && cashProvider.cardNumber == cardNumber){
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
