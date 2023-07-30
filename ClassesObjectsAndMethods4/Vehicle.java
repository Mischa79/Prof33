package Algorithms.lesson2.ClassesObjectsAndMethods4;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    // void range(){
    //     System.out.println("Bereich - " + fuelcap * mpg + " Meilen. ");//Дaльнocть
    // Это конструктор класса Vehicle ** Dies ist der Konstruktor der Vehicle-Klasse
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }


    // Определение дальности поездки транспортного средства
    //Bestimmen der Fahrstrecke eines Fahrzeugs
//    int range() {
//        return mpg * fuelcap;
        //Расчет количества топлива, необходимого транспортному средству для преодоления заданного расстояния
//Berechnung der vom Fahrzeug benötigten Kraftstoffmenge
// Mittel zur Überwindung einer bestimmten Distanz
  //  }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportsCar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;


        //int range1, range2;

//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
//
//        sportsCar.passengers = 2;
//        sportsCar.fuelcap = 14;
//        sportsCar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Überwinden " + dist + " Meilen Minivan erforderlich " + gallons + " Gallonen Kraftstoff");

        gallons = sportsCar.fuelNeeded(dist);
        System.out.println("Überwinden " + dist + " Meilen SportsCar erforderlich " + gallons + " Gallonen Kraftstoff");


//         range1 = minivan.fuelcap * minivan.mpg;
//         range2 = sportsCar.fuelcap * sportsCar.mpg;
        // range1 = minivan.range();
        //  range2 = sportsCar.range();

//        System.out.println("Minivan transportieren kann " + minivan.passengers + " Passengers auf Distanz. " + range1 + " Milen. ");
//        minivan.range();
//        System.out.println("SportsCar transportieren kann " + sportsCar.passengers + " Passengers auf Distanz. " + range2 + " Milen.");
//        sportsCar.range();


    }
}

class ChkNum {
    boolean isEven(int x) {
        return (x % 2) == 0;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();
        if (e.isEven(10)) System.out.println("10 - gerade Zahl");//четное число
        if (e.isEven(9)) System.out.println("9 - gerade Zahl");
        if (e.isEven(8)) System.out.println("8 - gerade Zahl");

    }
}

class Factor {
    boolean isFactor(int a, int b) {
        return (b % a) == 0;
    }
}

class isFact {
    public static void main(String[] args) {
        Factor x = new Factor();
        if (x.isFactor(2, 20)) System.out.println("2 - Teiler ");//делитель
        if (x.isFactor(3, 20)) System.out.println("Diese Zeile wird nicht gezüchtet"); //этa строка не будет  выведена


    }
}
