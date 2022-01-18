import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.Option;
import java.time.Period;
import java.util.Scanner;

public class AnalisisDataMatematis {
    public static void main(String[] args) {
        //percepatanGravitasi1();
        //percepatanGravitasi2();
        optionMenu();

    }

    /**
     * Method menghitung percepatan gravitasi variasi panjang 20 cm
     */
    static void percepatanGravitasi1(){
        // mencari gravitas
        // rumusnya g = (4 x phikuadrat x l) : Tkuadrat
        // maka,
        double l,T;
        Scanner scan = new Scanner(System.in);
        System.out.print("T = ");
        T = scan.nextDouble();

        var g = (4 * (3.14*3.14) * 0.2) / (T*T);
        System.out.println("Percepatan Gravitasinya = "+g+" m/ss");

    }

    /**
     * Method menghitung percepatan gravitasi variasi panjang 25 cm
     */
    static void percepatanGravitasi2(){
        // mencari gravitas
        // rumusnya g = (4 x phikuadrat x l) : Tkuadrat
        // maka,
        double l,T;
        Scanner scan = new Scanner(System.in);
        System.out.print("T = ");
        T = scan.nextDouble();

        var g = (4 * (3.14*3.14) * 0.25) / (T*T);
        System.out.println("Percepatan Gravitasinya = "+g+" m/ss");
    }

    /**
     * Untuk menampilkan opsi ingin menggunakan variasi panjang tali 20 cm atau 25 cm
     */
    static void optionMenu(){
        Scanner scan = new Scanner(System.in);
        int a = 20;
        int b = 25;
        int i;
        System.out.print("Pilih 20cm atau 25cm = ");
        i = scan.nextInt();

        if(i == a){
            percepatanGravitasi1();
        }else if(i == b) {
            percepatanGravitasi2();
        }else
            System.out.print("pilihannya cuma dua anjir!, ");
            optionMenu();
    }
}
