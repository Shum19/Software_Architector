package Home_Task_4.DataBases;

import Home_Task_4.ServerApp.User;

import java.util.ArrayList;
import java.util.List;

public class UserDateBases {
    private List<User> userList;
    private User user_1 = new User("I", "J", 1111_1111_1111_1111L, 1234);
    private User user_2 = new User("A", "B", 2222_2222_2222_2222L, 1234);
    private User user_3 = new User("C", "D", 3333_3333_3333_3333L, 1234);
    private User user_4 = new User("E", "F", 4444_4444_4444_4444L, 1234);
    private User user_5 = new User("G", "H", 5555_5555_5555_5555L, 1234);
    public void addUser(User user){
        this.userList.add(user);
        }
    private List<User> defaultUserList() {
        this.userList = new ArrayList<>();
        this.userList.add(user_1);
        this.userList.add(user_2);
        this.userList.add(user_3);
        this.userList.add(user_4);
        this.userList.add(user_5);
        return this.userList;
    }


    public List<User> getUserList(){
        return this.userList = defaultUserList();
    }
    public void print(){
        for (int i = 0; i < this.userList.size(); i++){
            System.out.println(this.userList.get(i));
        }
    }
    public UserDateBases(){
        this.userList = defaultUserList();
    }

}
