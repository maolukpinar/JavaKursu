package Gun37.instanceModifiers.PublicModifier.same;

public class ChromeBrowser {
    public static void main(String[] args) {

//public olduğundan rahatlıkla ulaşabiliyorum aynı paket içinden.
        SearchEngine google=new SearchEngine("crome");
        google.name="Crome";

        System.out.println("google = "+google);
//toString
    }
}
