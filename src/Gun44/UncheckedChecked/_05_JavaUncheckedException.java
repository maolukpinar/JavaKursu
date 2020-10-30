package Gun44.UncheckedChecked;

import java.io.FileInputStream;

public class _05_JavaUncheckedException {
    public static void main(String[] args) {
            //Dosya okuma yazma işlemidir bu.
            //bu işlemlere hata olasılığı yüksek olduüğundan
            //hata kontrolü zorunlu tutuluyor.
            //bu yüzden try catch e alınması zorunlu tutuluyor
            //bu gibi sorunlara karşılık gelen hatalara Checked Exception denir.

       try {


           FileInputStream file = new FileInputStream("dosya.txt");
       }
        catch (Exception ex)
        {

        }

    }
}
