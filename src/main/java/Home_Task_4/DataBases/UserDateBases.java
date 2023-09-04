package Home_Task_4.DataBases;

import Home_Task_4.ServerApp.User;

import java.util.ArrayList;
import java.util.List;

public class UserDateBases  {
    private List<User> userList;

    public void addUser(User user){
        this.userList.add(user);
        }
        // Создан дефолт лист для проверки программы
    private List<User> defaultUserList() {
        User user_1 = new User("I", "J", 1111_1111_1111_1111L, 1234);
        User user_2 = new User("A", "B", 2222_2222_2222_2222L, 1234);
        User user_3 = new User("C", "D", 3333_3333_3333_3333L, 1234);
        User user_4 = new User("E", "F", 4444_4444_4444_4444L, 1234);
        User user_5 = new User("G", "H", 5555_5555_5555_5555L, 1234);
        this.userList = new ArrayList<>();
        this.userList.add(user_1);
        this.userList.add(user_2);
        this.userList.add(user_3);
        this.userList.add(user_4);
        this.userList.add(user_5);
        return this.userList;
    }


    public List<User> getUserList(){
        return this.userList;
    }
    public void print(){
        for (int i = 0; i < this.userList.size(); i++){
            System.out.println(this.userList.get(i));
        }
    }
    public UserDateBases(){
        this.userList = defaultUserList();
    }
    public User login(String name, int hashPassword){
        int position = 0;
        for (int i = 0; i < this.userList.size(); i++) {
            if (this.userList.get(i).getName().equals(name) && this.userList.get(i).getHashPassword() == hashPassword){
                return this.userList.get(i);
            }
        }
        return null;
    }


}
