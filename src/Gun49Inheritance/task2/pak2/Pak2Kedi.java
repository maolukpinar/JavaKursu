package Gun49Inheritance.task2.pak2;

import Gun49Inheritance.task2.pak1.pak1Hayvan;

class pak2Kedi extends pak1Hayvan {

    public pak2Kedi(String ad, String cinsi) {
        super.ad = ad;
        super.cinsi =cinsi;
    }

    public void BilgiYaz()
    {
        System.out.println("super.ad = " + super.ad);
        System.out.println("super.cinsi = " + super.cinsi);
    }


}