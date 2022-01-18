import java.util.Scanner;
public class Kursus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b,c;

        System.out.print("Input Number = ");
        a = scan.nextDouble();
        if(a < 10){
            System.out.println("angka dibawah 10");
        }else if (a == 10){
            System.out.println("angka sama dengan 10");
        } else{
            System.out.println("angka diatas 10");
        }
    }

}
