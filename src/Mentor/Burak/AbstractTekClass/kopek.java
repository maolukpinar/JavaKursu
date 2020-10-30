package Mentor.Burak.AbstractTekClass;

abstract class kopek {
    public void havHav(){
        System.out.println("Hav Hav");
    }

    public abstract void besin();
}
class corgi extends kopek{

    @Override
    public void besin() {
        System.out.println("Corgi türü köpekler sadece proteinli mama yerler");
    }
}

class abstractTekClas{

    
}