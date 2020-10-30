package Mentor.Sema.Encapsulation._02Account;

public class Account {
    private long acc_no;
    private String name,email;
    private float amount;
        //Constractor kısmı
    public Account(long acc_no, String name, String email, float amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public Account() {

    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
