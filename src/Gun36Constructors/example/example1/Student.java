package Gun36Constructors.example.example1;
//Burası bir tür yapısı : class
public class Student {
    int id;
    String name;
    String surName;
    int classroom;

    //Constructor : yapıcı metod: ilk oluşmada yapılması
    //istenen işlemlerin yazıldığı metod.

    public Student(int id, String name, String surName, int classroom ){

        //this : clasın kendisini yani Studenti gösteriyor
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=classroom;

    }

    public Student(int id, String name, String surName){

        //this : clasın kendisini yani Studenti gösteriyor
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=0;

    }

    public Student(int id, String name){

        //this : clasın kendisini yani Studenti gösteriyor
        this.id=id;
        this.name=name;
        this.surName="";
        this.classroom=0;

    }
    public Student(int id){

        //this : clasın kendisini yani Studenti gösteriyor
        this.id=id;
        this.name="";
        this.surName="";
        this.classroom=0;

    }
    public Student(){

        //this : clasın kendisini yani Studenti gösteriyor
        this.id=0;
        this.name=name;
        this.surName="";
        this.classroom=0;

    }


//    public static Student creatStudent(int id, String name, String surName, int classroom){
//        Student ogrenci1=new Student();
//        ogrenci1.id=1;
//        ogrenci1.name="Ayşe";
//        ogrenci1.surName="Yılmaz";
//        ogrenci1.classroom=10;
//
//
//        return ogrenci1;
//
//
//    }
}
