package Gun49Inheritance.task1;

public class Dikdortgen extends Sekil {
    public double genislik;
    public double uzunluk;

    public Dikdortgen(double genislik, double uzunluk){
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }



    @Override
    public double getAlan(){
        return this.genislik * this.uzunluk;
    }
    @Override
    public double getCevre(){
        return (this.genislik+this.uzunluk)*2;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "genislik=" + genislik +
                ", uzunluk=" + uzunluk +
                '}';
    }


}
