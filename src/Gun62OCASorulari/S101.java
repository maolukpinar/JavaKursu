package Gun62OCASorulari;

public class S101 {
    // Extend işleminde subClass(child) da , super(parent) class daki access modifiers lar GENİŞLETİLEBİLİR
// fakat DARALTILAMAZLAR.
//  public -> protected -> default ->  private  (genişten -> dar a doğru)



        //super class
        abstract class Planet {
            protected void revolve(){ }
            abstract void rotate();
        }

        //sub class
        class Earth extends Planet {
            public void revolve(){
            }

            protected void rotate(){
            }
        }




    }

