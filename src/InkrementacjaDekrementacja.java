// Zwiększenie lub zmniejszenie wartości o 1

public class InkrementacjaDekrementacja {
    // inkrementacja zwiększanie wartości o jeden

    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartość a: " + a);//0
        int b = a++;
        System.out.println("Wartość b: " + b);//0
        System.out.println("Wartość a: " + a);//1
        int c = ++a;
        System.out.println("Wartość c: " + c);//2
        System.out.println("Wartość a: " + a);//2

    // dekrementacja zmniejszenie wartości o jeden
        int d = 0;
        System.out.println("Wartość d: " + d);//0
        int e = d--;
        System.out.println("Wartość e: " + e);//0
        System.out.println("Wartość d: " + d);//-2
        int f = --d;
        System.out.println("Wartość f: " + f);//-2
        System.out.println("Wartość d: " + d);//-2
    }
}
