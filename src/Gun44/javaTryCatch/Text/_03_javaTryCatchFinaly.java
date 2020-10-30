package Gun44.javaTryCatch.Text;

public class _03_javaTryCatchFinaly {
    public static void main(String[] args) {

        System.out.println("try bloğuna girmeden önceki kodlar çalıştı");

        try
        {


            String str = "bugün";
            System.out.println("Hatadan bir önceki adım");

            char ilhHarf = str.charAt(0);
            System.out.println("hatadan bir sonraki adım");
        }

        catch (Exception ex)//Hata olduğunda çalışacak kodlar bu bloğa yazılır
        {
            System.out.println("Catch bölümü çalıştı");
        }

        finally
        {
            System.out.println("Finaly bölümü çalıştı");
        }

        System.out.println("tüm hata kodlarından sonraki normal kodların yazıldığı bölüm çalıştı");
        
        
        
    }
}
