package Gun60OCASorulari;

public class S164 {
    public static void main(String[] args) {
        int data[] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;

        for (int e : data) {
            if (e != key) {
                continue;
              // count++;  continue ve break den sonra herhangi bir kod yazırlırsa çalışmaz
            }
        }
        System.out.println(count + "Found");

    }
}

