package model;

public class Buyer {

    private String nickname;

    private String name;

    private String surname;

    private String phone;

    private Gender gender;

    private float account;

    public Buyer(String nickname, String name, String surname, String phone, Gender gender, float account) {
        this.nickname = nickname;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.gender = gender;
        this.account = account;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public Gender getGender() {
        return gender;
    }

    public float getAccount() {
        return account;
    }

    public void increaseAccount(float sum) {
        account += sum;
    }

    public void decreaseAccount(float sum) {
        account += sum;
    }

    public enum Gender {
        MALE,
        FEMALE
    }
}
