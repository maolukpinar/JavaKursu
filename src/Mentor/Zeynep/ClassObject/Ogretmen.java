package Mentor.Zeynep.ClassObject;

//isim, bolum ve deneyim instance variable (degiskenlerini) iceren bir Ogretmen class i olusturunuz.
//ogretmenimNasil adli bir method icinde deneyim yilina gore ogretmenin kalitesini olcun.


public class Ogretmen {

    String isim;
    String bolum;
    int deneyim;

    String ogretmenimNasil()
    {
        if (deneyim < 2)
        {
            return "idare eder";
        }
        if (deneyim >= 2 && deneyim < 4)
        {
            return "daha iyisi olabilirdi";
        } else if (deneyim > 4)
            {
                return "daha ne olsun, adam super";
            }
            return "";



    }




}
