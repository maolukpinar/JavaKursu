package Mentor;

import java.util.*;

public class SetListAhmet {
    public static void main(String[] args) {


                int[] a = {1,2,3};

                int a1 = 5;
                var aa1 = 5;

                int b1;
                //  var bb1;   hatali tanimlama


                // 1. initialize tarzi
                ArrayList<Integer> arrList1 = new ArrayList<>();
                arrList1.add(1);
                arrList1.add(2);
                arrList1.add(2);

                ArrayList<Integer> arrList2 = new ArrayList<Integer>();

                List arrList3 = new ArrayList<Integer>();

                var arrList4 = new ArrayList<Integer>(List.of(1,2,3,4));

                // var arrList5 = new ArrayList<Integer>();


                // 2. initialize tarzi
                ArrayList<Integer> arrList5 = new ArrayList<>(){
                    {
                        add(3);
                        add(4);
                    }
                };

                // 3. initialize tarzi
                List arrList6 = new ArrayList<Integer>(List.of(1,2,3,4));



                ArrayList<Integer> arrayList8 = new ArrayList<>(arrList6);

                List arrList7 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,4));
                Set set1 = new HashSet<Integer>(arrList7);

                System.out.println(arrList7);
                System.out.println(set1);


                Set hs1 = new HashSet<Integer>();

        /*
            var tanimlarken initialize edilen tüm degiskenlerde kullanilabilir

            Array   int[] a = {1,2,3};
                    a[1]=1;

            Collections
            ----------------------------------
            List    --> ArrayList, LinkedList
                        .add()
                        .set(i,4)
                        .get()
                        mükerrer eleman olabilir

            Set     --> HashSet, LinkedHashset, TreeSet
                        .add()
                        unique, mükerrer eleman olmaz

                        HashSet         bir algoritmaya göre kayit
                        LinkedHashset   giris sirasina
                        TreeSet         sirali kaydeder


         */
                System.out.println("-----------------------");
                System.out.println(listToHashSet(arrList1));

                String str1 = "Merhaba";


                String str = new String("Merhaba");
                str = str.toUpperCase();
                System.out.println(str);

                System.out.println(new String("Merhaba").toUpperCase());

                int sayi = new Scanner(System.in).nextInt();

            }

            // gönderilen arraylisti set e dönüstüren method
            public static HashSet<Integer> listToHashSet(ArrayList<Integer> arrL){
                //HashSet<Integer> tempHS = new HashSet<>(arrL);
                HashSet<Integer> tempHS = new HashSet<>();
                tempHS.addAll(arrL);

                return tempHS;
                //return new HashSet<>();
            }


        }