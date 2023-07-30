package Algorithms.lesson2.ClassesObjectsAndMethods4;

public class This {

    double b;
    int e;
    double val;

    This(double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) val = val * base;
    }

    double get_pwr() {
        return val;
    }

    static class DemoPwr {
        public static void main(String[] args) {
            This x = new This(4.0, 2);
            This y = new This(2.5, 1);
            This z = new This(5.7, 0);

            System.out.println(x.b + " bis zu einem Grad " + x.e + " gleicht " + x.get_pwr());// встепени
            System.out.println(y.b + " bis zu einem Grad " + y.e + " gleicht  " + y.get_pwr());
            System.out.println(z.b + " bis zu einem Grad " + z.e + " gleicht  " + z.get_pwr());
        }
    }
}

class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) this.val = this.val * base;
    }

    double get_pwr() {
        return this.val;
    }


   static class SemoPwr {
        public static void main(String[] args) {
            This x = new This(4.0, 2);
            This y = new This(2.5, 1);
            This z = new This(5.7, 0);

            System.out.println(x.b + " bis zu einem Grad " + x.e + " gleicht " + x.get_pwr());// встепени
            System.out.println(y.b + " bis zu einem Grad " + y.e + " gleicht  " + y.get_pwr());
            System.out.println(z.b + " bis zu einem Grad " + z.e + " gleicht  " + z.get_pwr());
        }
    }
}


