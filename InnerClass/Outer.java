package Algorithms.lesson2.InnerClass;

//Применение внутреннего класса
//Anwenden einer inneren Klasse
public class Outer {
    int[]num;
    Outer(int[]n){
        num = n;
    }
    void Analyze(){
        Inner inOb = new Inner();
        System.out.println("Min.: " + inOb.min());
        System.out.println("Max.: " + inOb.max());
        System.out.println("Mitt.: " + inOb.avg());

    }
    //внутренний класс
    //innere Klasse
    class Inner{
        int min(){
            int m = num[0];
            for (int i = 1; i<num.length; i++)
                if (num[i] <m) m = num[i];
            return m;
        }
        int max(){
            int m = num[0];
            for (int i = 1; i<num.length; i++)
                if (num[i] >m) m = num[i];
            return m;
        }
        int avg(){
            int a = 0;
            for (int i = 1; i<num.length; i++)
               a += num[i];
            return a/num.length;
        }
    }
}
class NestedClassDemo{
    public static void main(String[] args) {
        int []x = {3,2,1,5,6,9,7,8};
        Outer outOb = new Outer(x);

        outOb.Analyze();
    }
}
//Применение класса ShowBits в качестве локального
//Verwendung der ShowBits-Klasse als lokale Klasse
class LocalClassDemo{
    public static void main(String[] args) {
        class ShowBits{
            final int numBits;
            ShowBits(int n){
                numBits = n;
            }
            void show(long val){
                long mask = 1;
             //сдвиг влево для установки еденицы в нужной позиции
             //Bewegen Sie die Taste nach links, um das Gerät an die gewünschte Position zu bringen
                mask <<= numBits -1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1){
                    if ((val & mask)!= 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if ((spacer % 8) == 0){
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for (byte b = 0; b<10;b++){
            ShowBits byteVal = new ShowBits(8);
            System.out.print(b+" in binärer Darstellung: ");//в двоичном представлении
            byteVal.show(b);
        }
    }
}
