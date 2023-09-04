package Home_Task_4.DataBases;



import Home_Task_4.ServerApp.User;

import java.util.ArrayList;
import java.util.List;

public class CashProviderDataBase {
    private List <BankUser> userList;
    private List<BankUser> defaultUserList() {
        BankUser user_1 = new BankUser("I", "J", 1111_1111_1111_1111L, 5000);
        BankUser user_2 = new BankUser("A", "B", 2222_2222_2222_2222L,100);
        BankUser user_3 = new BankUser("C", "D", 3333_3333_3333_3333L, 10000);
        BankUser user_4 = new BankUser("E", "F", 4444_4444_4444_4444L, 80);
        BankUser user_5 = new BankUser("G", "H", 5555_5555_5555_5555L, 800);
        this.userList = new ArrayList<>();
        this.userList.add(user_1);
        this.userList.add(user_2);
        this.userList.add(user_3);
        this.userList.add(user_4);
        this.userList.add(user_5);
        return this.userList;
    }
    public CashProviderDataBase(){
        this.userList = defaultUserList();
    }
    public List <BankUser> getUserList(){
        return this.userList;
    }
    public double getBalance(User user){
        for (int i = 0; i < this.getUserList().size(); i++) {
            if (this.getUserList().get(i).equals(user)){
                return this.userList.get(i).getBalance();
            }
        }
        return -1;
    }
    public void setBalance (){}
    public BankUser getBankUser(User user){
        for (int i = 0; i < this.userList.size(); i++) {
            if (this.userList.get(i).equals(user)){
                return this.userList.get(i);
            }
        }
        return null;
    }
}
