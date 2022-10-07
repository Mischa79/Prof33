package Algorithms.lesson2;

public class NOD {
    public static void main(String[] args) {
        System.out.println(ged(30,18));

    }
    public static int ged(int a, int b){
        while (b!=0){
           int temp = a%b;//9%5=4 %-остаток от деления
            a = b;
            b = temp;
        }
        return  a;
    }
}
