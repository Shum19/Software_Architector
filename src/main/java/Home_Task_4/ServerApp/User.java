package Home_Task_4.ServerApp;

public class User {
    private int id;
    private String name;
    private String surname;
    private long cardNumber;
    private int hashPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(int hashPassword) {
        this.hashPassword = hashPassword;
    }
    public User(String name, String surname, long cardNumber, int hashPassword){
        this.name = name;
        this.surname = surname;
        this. cardNumber = cardNumber;
        this.hashPassword = hashPassword;

    }
    @Override
    public String toString(){
        String cardNum = Long.toString(this.getCardNumber());
        cardNum = "******"+cardNum.substring(12, 16);
        String text = "User ID-" + this.id + " Name-" + this.name + " Surname-" + this.surname + " Card Number- " + cardNum;
        return text;
    }
}
