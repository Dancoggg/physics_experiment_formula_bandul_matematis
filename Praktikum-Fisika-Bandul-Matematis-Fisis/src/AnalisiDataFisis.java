import java.util.Scanner;

public class AnalisiDataFisis {
    public static void main(String[] args) {
        variasi5Drajat();
        lopingPerhitungan(3);

    }

    /**
     * untuk melooping perhitungan agar dapat sekaligus lebih dari satu
     * @param looping
     */
    static void lopingPerhitungan(int looping){
        for(int i = 0;i <= looping;i++){
            variasi5Drajat();
        }
    }

    /**
     * Untuk menghitung percepatan gravitasinya
     */
    static void variasi5Drajat(){
        //variabel a1,a2,t1,t2,T1,T2
        double a1,a2,t1,t2,T1,T2,g1,g2,G;
        // rumus, g = (3.14kuadrat x 8 x (a1kuadrat + a2kuadrat)) / (8 x ((a1 - a2)(T1kuadrat + T2kuadrat) + (a1 + a2)(T1kuadrat - T2kuadrat)))
        // maka
        Scanner scan = new Scanner(System.in);
        System.out.print("a1 = ");
        a1 = scan.nextDouble();
        System.out.print("a2 = ");
        a2 = scan.nextDouble();
        System.out.print("t1 = ");
        t1 = scan.nextDouble();
        System.out.print("t2 = ");
        t2 = scan.nextDouble();
        T1 = t1/6;
        T2 = t2/6;

        // ke rumus
        g1 = (3.14*3.14)*8*((a1*a1)-(a2*a2));
        g2 = ((a1 - a2) * (((T1*T1))+(T2*T2))) +((a1 + a2) * (((T1*T1))-(T2*T2)));
        G = g1 / g2 / 100;
        System.out.println("Percepatan Gravitasi = "+G);
        System.out.println("T1 = "+T1);
        System.out.println("T2 = "+T2);

    }



}
