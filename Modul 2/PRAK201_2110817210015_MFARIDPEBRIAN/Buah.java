package PRAK201_2110817210015_MFARIDPEBRIAN;

public class Buah {
    private String nama;
    private String warna;
    private String tekstur;
    private String rasa;
    private double berat;
    private int jumlah_beli;
    private int harga;

    public Buah(String nama, String warna, String tekstur, String rasa, double berat, int jumlah_beli, int harga){
        this.nama = nama;
        this.warna = warna;
        this.tekstur = tekstur;
        this.rasa = rasa;
        this.berat = berat;
        this.jumlah_beli = jumlah_beli;
        this.harga = harga;
    }

    public void displayBuahStatus(){
        System.out.println("Nama Mangga: " + nama);
        System.out.println("Berat : " + berat + " kg");
        System.out.println("Jumlah Beli : " + jumlah_beli);
        System.out.println("Total Berat : " + jumlah_beli*berat + " kg");
        System.out.println("Total Harga : Rp. " + jumlah_beli*harga);
        System.out.println();
    }
}
