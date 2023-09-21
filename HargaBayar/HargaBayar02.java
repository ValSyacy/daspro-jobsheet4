import java.util.Scanner;

public class HargaBayar02 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        int harga, jumlah, halaman;
        double diskon, total, bayar, jumlah_diskon;
        String merek;

        System.out.println("\nMasukkan Merek Buku Yang Anda Beli");
        merek=input.next();
        System.out.println("\nMasukkan Jumlah Halaman Buku Yang Anda");
        halaman=input.nextInt();
        System.out.println("\nMasukkan Total Diskon Yang Anda Terima");
        diskon=input.nextDouble();
        System.out.println("\nMasukkan Harga Barang Yang Dibeli");
        harga=input.nextInt();
        System.out.println("\nMasukkan Jumlah Barang Yang Dibeli");
        jumlah=input.nextInt();
    
        total = harga * jumlah;
        jumlah_diskon = total * diskon;
        bayar = total - jumlah_diskon;

        System.out.println("\n--------Struk Informasi Pembelian Anda--------");
        System.out.println("Merek Buku\t\t\t\t : " + merek);
        System.out.println("Jumlah Halaman Buku\t\t\t : " + halaman);
        System.out.println("Harga Satuan\t\t\t\t : " + harga);
        System.out.println("Jumlah Barang\t\t\t\t : " + jumlah);
        System.out.println("Anda Mendapatkan Diskon Senilai\t\t : " + jumlah_diskon);
        System.out.println("Total Harga Yang Harus Anda Bayar Senilai: Rp." + bayar + "\n");
    }
}