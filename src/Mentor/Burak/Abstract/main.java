package Mentor.Burak.Abstract;

public class main {
    public static void main(String[] args) {

        abstractDatabese samsung = new samsungDatabese();
        abstractDatabese huawei = new huaweiDatabase();

        samsung.add();
        samsung.delete();
        samsung.get();
        samsung.update();

        System.out.println("----------------------------------");

        huawei.add();
        huawei.delete();
        huawei.get();
        huawei.update();
    }

}
