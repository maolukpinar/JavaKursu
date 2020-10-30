package Mentor.Sema.Encapsulation._02Account;

public class AccountMain {
    public static void main(String[] args) {


        Account account1 = new Account(11111,"Ali","aaaaa@gmail.com",1000);
        System.out.println(account1.getAcc_no()+" "+account1.getName()+" "+account1.getEmail()+" "+account1.getAmount());

    }
}
