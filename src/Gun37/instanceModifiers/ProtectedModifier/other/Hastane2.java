package Gun37.instanceModifiers.ProtectedModifier.other;

import Gun37.instanceModifiers.ProtectedModifier.same.Doktor;

public class Hastane2 {
    public static void main(String[] args) {
        //protected olduğundan default gibi diğer paketlerden kullanılamıyor
       // Doktor dr3=new Doktor();

  Doktor dr4=new Doktor("Ömer");//Bu erişim public
        //olduğundan kullanılabildi.


        //dr4.print(); erişim belirteci protected olduğundan
        //kullanılamaz

    }
}
