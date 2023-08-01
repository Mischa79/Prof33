package Algorithms.lesson2.Extends;
//
// class TwoDShape {
//    double width;
//    double height;
//    void showDim(){
//        System.out.println("Breite und Höhe - " + width + " und " + height);//ширина и высота
//    }
//}
//class Triangle extends TwoDShape{
//     String style;
//     double area(){
//         return width * height / 2;
//     }
//     void showStyle(){
//         System.out.println("Dreieck " + style);// Tpeyгoльник
//     }
//}
//class Shapes{
//    public static void main(String[] args) {
//        Triangle t1 = new Triangle();
//        Triangle t2 = new Triangle();
//
//        t1.width = 4.0;
//        t1.height = 4.0;
//        t1.style = "übermalt";  //закрашенный
//
//        t2.width = 8.0;
//        t2.height = 12.0;
//        t2.style = "Kontur";  //контурный
//
//        System.out.println("Information über t1: ");
//        t1.showStyle();
//        t1.showDim();
//        System.out.println("Bereich - " + t1.area());// Плoщaдь
//        System.out.println();
//
//        System.out.println("Information über t2: ");
//        t2.showStyle();
//        t2.showDim();
//        System.out.println("Bereich - " + t2.area());
//    }
//}
//class Rectangle extends TwoDShape{
//     boolean isSquare(){
//         if (width == height) return true;
//         return false;
//     }
//     double area(){
//         return width * height;
//    }
//}
//Использование методов доступа для установки и
// получения значений закрытых членов
//Verwenden von Zugriffsmethoden zum Festlegen und
// Werte privater Mitglieder abrufen
//Добавление конструктора в класс Triangle
//Hinzufügen eines Konstruktors zur Triangle-Klasse

import Algorithms.lesson2.ClassesObjectsAndMethods4.Vehicle;

abstract class TwoDShape{
    private double width;
    private double height;
    private final String name;
    //конструктор заданный по умолчанию
    //Standardkonstruktor
   TwoDShape(){
       width = height = 0.0;
       name = "none";
   }

//Параметризированный конструктор
//Parametrisierter Konstruktor
    public TwoDShape(double w, double h, String n) {
        width = w;
        height= h;
        name = n;
    }
    //создание объекта с одинаковыми значениями
    //Erstellen eines Objekts mit denselben Werten
    TwoDShape(double x, String n){
       width = height = x;
       name = n;
    }
    //создание одного объекта на основе другого
    //ein Objekt aus einem anderen erstellen
    TwoDShape(TwoDShape ob){
       width = ob.width;
       height = ob.height;
       name = ob.name;
    }

    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}
    String getName(){return name;}

    void showDim(){
        System.out.println("Breite und Höhe - " + width + " und " + height);
    }
    abstract double area();
        //System.out.println("Method area() muss neu definiert werden");//должен быть еереопределен**
        //return 0.0;
}
class Triangle extends TwoDShape{
   // String style;
     private final String style;
     Triangle(){
         super();//вызов с двумя аргументами ** Aufruf mit zwei Argumenten
         style = "none";
     }

     //Konstruktor
    Triangle(String s, double w, double h){
//        setWidth(w);
//        setHeight(h);
      super(w, h,"Dreieck");//вызов конструктора суперкласса
        //Aufruf des Superklassen-Konstruktors
        style = s;
    }
    Triangle (double x){
         super(x,"Dreieck");//вызов с одним аргументом ** Aufruf mit einem Argument
        style = "übermalt";
    }
    Triangle(Triangle ob){
         super(ob);
         style = ob.style;
    }
     double area(){
         return getWidth() * getHeight() / 2;
     }
     void showStyle(){
        System.out.println("Dreieck " + style);
    }
}
class Rectangle extends TwoDShape {
    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "Rechteck");//прямоугольник
    }

    Rectangle(double x) {
        super(x, "Rechteck");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    double area() {
        return getWidth() * getHeight();
    }
}
class DynShapes{
    public static void main(String[] args) {
        TwoDShape []shapes = new TwoDShape[5];
        shapes[0] = new Triangle("Kontur",8.0,12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);
       // shapes[4] = new TwoDShape(10,20,"Figure");

        for (int i = 0; i < shapes.length; i++){
            System.out.println("Object - " + shapes[i].getName());
            System.out.println("Bereicht - " + shapes[i].area());
            System.out.println();
        }
    }
}
//class ColorTriangle extends Triangle{
//    private String color;
//    ColorTriangle(String c, String s, double w, double h){
//        super(s,w,h);
//        color = c;
//    }
//    String getColor(){return color;}
//    void showColor(){
//        System.out.println("Color - " + color);
//    }
//}
//class Shapes{
//    public static void main(String[] args) {
//        Triangle t1 = new Triangle("Kontur",8.0,12.0);
//        Triangle t2 = new Triangle(t1);

//        ColorTriangle t1 = new ColorTriangle("Blau","Kontur",8.0,12.0);
//        ColorTriangle t2 =new ColorTriangle("Red","Übermalt",2.0,2.0);

//        Triangle t1 = new Triangle("übermalt",4.0,4.0);
//        Triangle t2 = new Triangle("Kontur",8.0,12.0);
//        Triangle t3 = new Triangle(4.0);


       //t1 = t2;

//        t1.setWidth(4.0);
//        t1.setHeight(4.0);
//        t1.style = "übermalt";
//
//        t2.setWidth(8.0);
//        t2.setHeight(12.0);
//        t2.style = "Kontur";

//        System.out.println("Information über t1: ");
//        t1.showStyle();
//        t1.showDim();
//       // t1.showColor();
//        System.out.println("Bereich - " + t1.area());
//        System.out.println();
//
//        System.out.println("Information über t2: ");
//        t2.showStyle();
//        t2.showDim();
//       // t2.showColor();
//        System.out.println("Bereich - " + t2.area());
//        System.out.println();

//        System.out.println("Information über t3: ");
//        t3.showStyle();
//        t3.showDim();
//        System.out.println("Bereich - " + t3.area());



class A{
    int i;
}
class B extends A{
    int i;
    B(int a, int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in Unterklasse: " + i);//Подкласс
    }
}
class UseSuper{
    public static void main(String[] args) {
        B subOb = new B(1,2);
        subOb.show();
    }
}
//расширенный класс vehicle для грузовиков
//erweiterte  vehicle  klasse für LKW
class  Vehicle1{
    private int passengers;
    private int fuelCap;
    private int mpg;

    Vehicle1(int p, int f, int m){
        passengers = p;
        fuelCap = f;
        mpg = m;
    }
    int range(){
        return mpg * fuelCap;
    }
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
    int getPassengers() {return passengers;}
    void setPassengers(int p) {passengers = p;}
    int getFuelCap() {return fuelCap;}
    void setFuelCap(int f) {fuelCap = f;}
    int getMpg(int m) {return mpg;}
    void setMpg(int m) {mpg = m;}
}

class Truck extends Vehicle1{
    private int cargoCap;
    Truck(int p,int f, int m, int c){
        super(p, f, m);
        cargoCap = c;
    }
    int getCargo(){return cargoCap;}
    void putCargo(int c){cargoCap = c;}
}
class TruckDemo{
    public static void main(String[] args) {
        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println("Der LKW kann transportieren: " + semi.getCargo() + " Pfund." );//Грузовик может перевезти
        System.out.println("Überwinden " + dist + " Meilenabholung LKW erforderlich " + gallons + " Kraftstoff Halon.\n");//Для преодоления

        gallons = pickup.fuelNeeded(dist);

        System.out.println("Der LKW kann transportieren: " + pickup.getCargo() + " Pfund." );//Грузовик может перевезти
        System.out.println("Überwinden " + dist + " Meilenabholung Pick-Up erforderlich " + gallons + " Kraftstoff Halon.");

    }
}
//Демонстрация очередности вызова конструктора
//Demonstration der Aufrufreihenfolge des Konstruktors
class A1{
    A1(){
        System.out.println("Konstructor A1");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("Konstructor B1");
    }
}
class C1 extends B1{
    C1(){
        System.out.println("Konstructor C1");
    }
}
class OrderOfConstruction{
    public static void main(String[] args) {
        C1 c1 = new C1();
    }
}
//обращение к объекту подкласса по ссылочной переменной суперкласса
//Zugriff auf ein Unterklassenobjekt über eine Oberklassen-Referenzvariable
class X{
    int a;
    X(int i){a = i;}
}
class Y extends X{
    int b;
    Y(int i, int j){
        super(j);
        b = i;
    }
}
class SupSubRef{
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5,6);
        x2 = x;
        System.out.println("x2.a: " + x2.a);
        x2 = y;
        System.out.println("x2.a: " + x2.a);
        x2.a = 19;
    }
}
//Переопределение меоода ** Eine Methode neu definieren
class A2{
    int i, j;
    A2(int a, int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("i und j:" + i + " " + j);
    }
}
class B2 extends A2{
    int k;
    B2(int a, int b, int c){
        super(a,b);
        k = c;
        System.out.println("k: " + k);
    }
}
class Override{
    public static void main(String[] args) {
        B2 subOb = new B2(1,2,3);
        subOb.show();
    }
}
//динамическая диспетчерезация методов ** Dynamischer Methodenversand
class Sup{
    void who(){
        System.out.println("who() in Sup");
    }
}
class Sub1 extends Sup{
    void who(){
        System.out.println("who() in Sub1");
    }
}
class Sub2 extends Sup{
    void who(){
        System.out.println("who() in Sub2");
    }
}
class DynDisDemo{
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

         Sup supRef;

         supRef = superOb;
         supRef.who();

         supRef = subOb1;
         supRef.who();

         supRef = subOb2;
         supRef.who();
    }
}


