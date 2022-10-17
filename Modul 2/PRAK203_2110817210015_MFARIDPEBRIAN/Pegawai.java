package PRAK203_2110817210015_MFARIDPEBRIAN;
// Pada baris ini terjadi error karena nama variabel class dalam baris kode berbeda dengan nama file class-nya
// Sehingga perlu disamakan penggunaan nama class dalam file dan baris kode
// public class Employee {
public class Pegawai {
    public String nama;
    // Baris ini membuat error pada baris 19 (return asal;) 
    // dan pada file Soal3Main.java baris 10(p1.asal = "Kingdom of Orvel";) 
    // karena yang digunakan tipe data string
    // Sehingga perlu dilakukan pengubahan ke tipe data yang sesuai, yaitu string
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
    return nama;
    }

    public String getAsal() {
    return asal;
    }
    
    // Baris ini membuat error pada baris 29 (this.jabatan = j;) 
    // karena tipe data variabel j masih belum dideklarasikan
    // Sehingga perlu dideklarasikan tipe data variabel j 
    // public void setJabatan() {
    public void setJabatan(String j) {
    this.jabatan = j;
    }
}