package Gun31ClassAndObject.example.Ex1;
//3.Yöntem
public class ex1 {
    //Ayrı bir dosyada Student classı tanımlayınız; fields: name, grade
    //Ayrı bir dosyada Scholl classı tanımlayınız; fields: name, adress,principalName,tuitionFees

    public static void main(String[] args) {

        Student ogrenci1=new Student();
        ogrenci1.name="Ayşe";
        ogrenci1.grade=3;

        //1.Yöntem
        Scholl okulu = new Scholl();
        okulu.adress="Göztepe";
        okulu.name="Marmara Üniversitesi";
        okulu.principalName="Rektör";
        okulu.tuitionFees=0;

        ogrenci1.schollInfo=okulu;

        //2.Yöntem
        ogrenci1.schollInfo = new Scholl();
        ogrenci1.schollInfo.adress="Göztepe";
        ogrenci1.schollInfo.name="Marmara Üniversitesi";
        ogrenci1.schollInfo.principalName="Rektör";
        ogrenci1.schollInfo.tuitionFees=0;

        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);




    }
}
