package Gun36Constructors.Tasks.task1;

public class Book {


        String name;
         int publishYear;
        String author;

    public Book(String name, String author, int publishYear)
       {
           this.name=name;
           this.publishYear=publishYear;
           this.author=author;
       }

    public Book(String name, int publishYear)
    {
        this.name=name;
        this.publishYear=publishYear;
        this.author="";

    }

    public Book()
    {
        this.name="";
        this.publishYear=0;
        this.author="";
    }

    public void ShowInfo()
    {
    System.out.println(name+" "+publishYear+" "+author);
    }

}
