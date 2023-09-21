import java.util.Scanner;

public class Lingkaran02 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int r;
        double luas, keliling;
        double π = 3.14;

        System.out.println("Masukkan Nilai Jari-Jari");
        r=input.nextInt();
    
        luas = π * r * r;
        keliling = 2 * π * r;

        System.out.println(luas);
        System.out.println(keliling);
    }
}