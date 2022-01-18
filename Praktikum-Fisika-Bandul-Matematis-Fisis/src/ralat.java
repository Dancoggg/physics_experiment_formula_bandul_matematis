import java.util.Scanner;

public class ralat {
    public static void main(String[] args){
        ralatMutlak();
        ralatNisbi();
        keseksamaan();
    }

    /**
     * Ralat Mutlak
     * variabel t sebagai rata-rata dari kuadrat(waktu - rata-rata waktu)
     */
    static void ralatMutlak(){
        double t;

        Scanner scan = new Scanner(System.in);
        System.out.print("t = ");
        t = scan.nextDouble();

        var ralat = Math.sqrt(t / 20);
        System.out.println("Ralat Mutlak = "+ralat);
        System.out.println(" ");
    }

    /**
     * Ralat Nisbi
     * variabel M sebagai hasil dari Ralat Mutlak
     * variabel t sebagai rata-rata waktu
     */
    static void ralatNisbi(){
        double M;
        double t;
        Scanner scan = new Scanner(System.in);
        System.out.print("M = ");
        M = scan.nextDouble();
        System.out.print("t = ");
        t = scan.nextDouble();

        var ralat = (M / t) * 100;
        System.out.println("Ralat Nisbi = "+ralat+" %");
        System.out.println(" ");
    }

    /**
     * Keseksamaan
     * variabel I sebagai hasil dari Ralat Nisbi
     */
    static void keseksamaan(){
        double I;
        Scanner scan = new Scanner(System.in);
        System.out.print("M = ");
        I = scan.nextDouble();

        var ralat = 100 - I;
        System.out.println("Keseksamaan = "+ralat+" %");
    }
}
