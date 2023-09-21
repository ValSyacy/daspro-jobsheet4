import java.util.Scanner;

public class Gaji02 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int jumlah_masuk, jumlah_tidakmasuk, total_gaji;
        int gaji=40000, pot_gaji=25000;

        System.out.println("\nMasukkan Jumlah Hari Masuk Kerja Anda");
        jumlah_masuk=input.nextInt();
        System.out.println("\nMasukkan Jumlah Hari Tidak Masuk Kerja Anda");
        jumlah_tidakmasuk=input.nextInt();
    
        total_gaji = (jumlah_masuk * gaji) - (jumlah_tidakmasuk * pot_gaji);

        System.out.println("Gaji Yang Anda Terima Senilai\n" + "Rp." +total_gaji);
    }
}