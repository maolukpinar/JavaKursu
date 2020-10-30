package Gun46Encapsulation.Tasks.task1;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {



        int miktar=0;
        Scanner oku = new Scanner(System.in);
        boolean usernameIste =true;
        String username="";

        do{
            if(usernameIste) {
                System.out.print((miktar + 1) + ".User Name : ");
                 username = oku.nextLine();

            }
            System.out.print("Password : ");
            String password =oku.nextLine();
            try {
                User yeniUser = new User(username, password);
                miktar++;
                usernameIste =true;
            }
            catch (Exception ex)
            {
                usernameIste =false;
                System.out.println(ex.getMessage());
            }


        }while (miktar<6);





    }
}
