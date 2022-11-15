package praktikum4.soal2;

import java.util.Scanner;

public class BukuDriver {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih buku yang ingin diinputkan");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();
        
        if (pilihan == 1){
            
            System.out.print("Judul: ");
            String judul = input.nextLine();

            System.out.print("Penulis: ");
            String penulis = input.nextLine();

            System.out.print("Tahun Terbit: ");
            String tahun = input.nextLine();

            System.out.print("Genre: ");
            String genre = input.nextLine();

            System.out.print("Sinopsis: ");
            String sinopsis = input.nextLine(); 
               
            Novel NovelBaru = new Novel(judul, penulis, tahun, genre, sinopsis);
            NovelBaru.display();         
            System.out.println(NovelBaru.getNovelDetail());
            
        } else if (pilihan == 2){
            
            System.out.print("Judul: ");
            String judul = input.nextLine();

            System.out.print("Penulis: ");
            String penulis = input.nextLine();

            System.out.print("Tahun Terbit: ");
            String tahun = input.nextLine();

            System.out.print("Volume: ");
            int volume = input.nextInt();
            input.nextLine();

            System.out.print("Sinopsis: ");
            String sinopsis = input.nextLine();
            
            Komik KomikBaru = new Komik(judul, penulis, tahun, volume, sinopsis);
            KomikBaru.display();
            System.out.println(KomikBaru.getKomikDetail());            
        }
    }  
}