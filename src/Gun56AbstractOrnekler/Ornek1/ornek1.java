package Gun56AbstractOrnekler.Ornek1;



class C{
    public C(){
        System.out.println("C");
    }
}

//Constructur da ilk çağrılan super constructor olmali. Aksi takdirde capile hatasi verir.
class B extends C{
    public B(){

        //super(); yandaki metod yazılsa da yazılmasa da önce super Constructor cağrılıyor
        System.out.println("B");
    }
}


class A extends B{
    public A(){
        //super(); yandaki metod yazılsa da yazılmasa da önce super Constructor cağrılıyor
        System.out.println("A");
    }
}
public class ornek1 {
    public static void main(String[] args) {
        A a = new A();
    }
}
