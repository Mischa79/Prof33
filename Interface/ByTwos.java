package Algorithms.lesson2.Interface;

public class ByTwos implements Series{
    int start;
    int val;
    int prev;
    ByTwos(){
        start = 0;
        val = 0;
        prev = -2;
    }
    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }
    int getPrevious(){
        return prev;
    }
}
class ByThrees implements Series{
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        start = 0;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;

    }
}
class seriesDemo2{
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();

        Series ob;

        for (int i =0; i < 5; i++){
            ob =  twoOb;
            System.out.println("nächster Wert ByTwos: " +  ob.getNext());


                ob =   threeOb;
                System.out.println("nächster Wert ByThrees: " +  ob.getNext());
        }
    }
}
class SeriesDemo{
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i =0; i < 5; i++)
            System.out.println("nächster Wert: " + ob.getNext());//следующее значение

        System.out.println("\nzurücksetzen");
        ob.reset();

        for (int i =0; i < 5; i++)
            System.out.println("nächster Wert: " + ob.getNext());


        System.out.println("\nUrsprünglicher Wert: 100");//Haчaльнoe значение
        ob.setStart(100);


        for (int i = 0; i< 5;i++)
            System.out.println("nächster Wert: " + ob.getNext());
    }
}
//Класс, реализующий очередь фиксированного размера ** Eine Klasse, die eine Warteschlange mit fester Größe implementiert
