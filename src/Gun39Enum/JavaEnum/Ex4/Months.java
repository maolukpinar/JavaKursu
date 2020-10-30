package Gun39Enum.JavaEnum.Ex4;

public enum  Months {
    OCAK(31),
    ŞUBAT(28),
    MART(31),
    NİSAN(30),
    MAYIS(31),
    HAZİRAN(30),
    TEMMUZ(31),
    AĞUSTOS(31),
    EYLÜL(30),
    EKİM(31),
    KASIM(30),
    ARALIK(31);

    int days;
    //Bu bölüm atama işlemi olduğu anda çalışıyor
    Months(int gunMiktarı){
        days=gunMiktarı;
    }
    void getGunMiktari()
    {
        System.out.println("days = " +days);
    }


}
