package Mentor.Burak.Abstract;

public abstract class abstractDatabese {
    public void add(){
        System.out.println("Eklendi");
    }
    public void delete(){
        System.out.println("Silindi");
    }
    abstract void get();
    abstract void update();
}
