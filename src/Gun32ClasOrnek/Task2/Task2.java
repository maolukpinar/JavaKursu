package Gun32ClasOrnek.Task2;

public class Task2 {
    //1.Adım : ayrı dosyada olmak üzere Customer isimli bir clas tanımlayınız.
    //2.Adım : ayrı bir dosyada ElectricityAccount isimli (fields :totalKw, rate, bill)
    //3.Adım : Customer a bir ElectricityAccount ekleyiniz.
    //4.Adım : 1 tane müşteri oluşturunuz, Account u dahil;
    //5.Adım : Müşteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız

    public static void main(String[] args) {

      Customer musteri1 = new Customer();
      musteri1.name ="Kaya";
      musteri1.electiricityAccount =new ElectiricityAccount();

    }
}
