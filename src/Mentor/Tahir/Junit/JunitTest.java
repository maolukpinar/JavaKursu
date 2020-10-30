package Mentor.Tahir.Junit;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    //Assert.assertEquals
    @Test
    public void testLastChar(){
        Main m=new Main();
        char methodumuzunSonucu=m.lastCharcter("junit");
        char olmasıGerekenSonuc='t';

        //Assert.assertEquals(olmasıGerekenSonuc,methodumuzunSonucu);
        Assert.assertEquals("Kodunuz hatali",'t',m.lastCharcter("junit"));
    }
    @Test//Anotaishen
    public void testMaxNumber(){
        Main m=new Main();
        int[]arr={1,2,3,4,5,6};
       int sonuc= m.maxNumberArray(arr);

       Assert.assertEquals("Metodun hatalı",6,sonuc);

    }


    @Test
    public void testFaktöriyel(){
        Main m=new Main();
        int i=5;
        int sonuc=m.factorial(i);
        Assert.assertEquals(120,sonuc);
    }

    @Test
    public void testDeneme(){
  //      String s1="java";
  //      String s2="Java";
  //      boolean b=s1.equals(s2);

    //    Assert.assertTrue(b);


        boolean b1=true && false;
        Assert.assertFalse(b1);
    }


}
