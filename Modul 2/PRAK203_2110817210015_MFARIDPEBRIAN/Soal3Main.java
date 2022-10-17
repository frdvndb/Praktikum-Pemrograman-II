package PRAK203_2110817210015_MFARIDPEBRIAN;

public class Soal3Main {
    public static void main(String[] args) {
    Pegawai p1 = new Pegawai();
    // Pada baris ini terjadi error karena kurang penutup baris kode, yaitu titik koma (;)
    // Sehingga perlu ditambahkan pada akhir baris kode tersebut
    // p1.nama = "Roi"
    p1.nama = "Roi";
    p1.asal = "Kingdom of Orvel";
    p1.setJabatan("Assasin");
    // Baris kode berikut tidak ada dalam program
    // Akan tetapi, tanpa baris kode berikut, output umur = 0, sedangkan pada output soal, umur = 17
    // Sehingga perlu ditambahkan baris kode yang menyatakan nilai dari umur
    p1.umur = 17;
    System.out.println("Nama: " + p1.getNama());
    System.out.println("Asal: " + p1.getAsal());
    System.out.println("Jabatan: " + p1.jabatan);
    System.out.println("Umur: " + p1.umur + " tahun");
    }
}