package praktikum1;
import java.util.Scanner;

public class PRAK105_2110817210015_MFARIDPEBRIAN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("-------INPUT-------");
        System.out.print("Masukkan jari-jari: ");
        double jari2 = in.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = in.nextDouble();
        double volume_tabung = PI*(jari2*jari2)*tinggi;
        System.out.println("\n-------OUTPUT-------");
        System.out.printf("Volume tabung dengan jari-jari %.1f cm ", jari2);
        System.out.printf("dan tinggi %.1f cm adalah %.3f m3\n", tinggi, volume_tabung);
    }
}