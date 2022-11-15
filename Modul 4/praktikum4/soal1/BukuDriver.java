package praktikum4.soal1;

import java.util.Scanner;

public class BukuDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Judul: ");
        String judul = input.nextLine();
        System.out.print("Penulis: ");
        String penulis = input.nextLine();
        System.out.print("Tahun: ");
        int tahun = input.nextInt();
        
        Buku BukuBaru = new Buku(judul, penulis, tahun);
        
        BukuBaru.display();        
    }    
}
