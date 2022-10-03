package praktikum1;
import java.util.Scanner;

public class PRAK101_2110817210015_MFARIDPEBRIAN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("--------INPUT--------");
        System.out.print("Masukkan Nama: ");
        String nama_lengkap = in.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempat_lahir = in.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal_lahir = in.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulan_lahir = in.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahun_lahir = in.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi_badan = in.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        float berat_badan = in.nextFloat();
   
    String[] bulan = {"Januari",  "Februari", "Maret",    
                      "April",    "Mei",      "Juni",     
                      "Juli",     "Agustus",  "September",
                      "Oktober",  "November", "Desember"};
            
    System.out.println("\n--------OUTPUT--------");
    System.out.println("Data Telah Ditambahkan,");
    System.out.println("Nama Lengkap " + nama_lengkap + 
            ", Lahir di " + tempat_lahir + 
            " pada Tanggal " + tanggal_lahir + 
            " " + bulan[bulan_lahir-1] + 
            " " + tahun_lahir);
    System.out.println("Tinggi Badan " + tinggi_badan + 
            " dan Berat Badan " + berat_badan + " kilogram");
    }
}