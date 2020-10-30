package Gun36Constructors.Tasks.task1;

public class Task1 {

    public static void main(String[] args) {

   Book kitap1=new Book("Sefiller","Viktor Hügo",1934);
   Book kitap2=new Book("Kavgam", 2000);
   Book kitap3=new Book();
   kitap3.name="Vadideki Zambak";

   kitap1.ShowInfo();
   kitap2.ShowInfo();
   kitap3.ShowInfo();






    }

}
