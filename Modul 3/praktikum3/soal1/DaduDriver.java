package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class DaduDriver {
    public static void main(String[] args) {
        Dadu dadu = new Dadu();
        LinkedList<Integer> nilaiSemuaDadu = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int jumlahDadu = in.nextInt();
        int total = 0;
        int i = 0;
        while (i < jumlahDadu){
            nilaiSemuaDadu.add(dadu.AcakNilai());
            System.out.println("Dadu ke-" + (i+1)+ " bernilai " + nilaiSemuaDadu.get(i));
            total = total + nilaiSemuaDadu.get(i);
            i++;
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}