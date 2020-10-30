package Gun28Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {

        //RemoveAll, RetainAll, AddAll

        Set<Integer> hs1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> hs2=new HashSet<>(Arrays.asList(4,5,6,7,8));

        //retainAll : Kesişim

        Set<Integer> hsKesisim=new HashSet<>(hs1); //hs1 den kopya oluşturdu
        hsKesisim.retainAll(hs2);//hs1 ile hs2 nin kesişimi bulundu
        System.out.println("hsKesisim = " + hsKesisim);//ortak elemanlar bulundu
        
        Set<Integer> hsFark = new HashSet<>(hs1);
        //kopya oluşturnmanın 2. Yöntemi
        //hsFark.addAll(hs1);//hs1 in tamamı hsFark a atandı
        hsFark.removeAll(hs2);
        System.out.println("hsFark = " + hsFark);




    }
}
