public class Casting {
    public static void main (String[] args){
        //En un a;o ubicar 30 perritos
        //Cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimacion
        int estimatedMontlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMontlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println(a/b);

        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);

        short ns = (short) n;
        System.out.println(n);

    }
}
