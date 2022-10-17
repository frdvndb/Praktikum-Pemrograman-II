package PRAK202_2110817210015_MFARIDPEBRIAN;
import java.text.NumberFormat;
import java.util.Locale;

public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    private String pemilik;

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    public String getPajak() {
        String pajak = NumberFormat.getNumberInstance(Locale.JAPANESE).format(this.harga*2/100);
        return pajak;
    }
        
    public void info(){
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " + NumberFormat.getNumberInstance(Locale.US).format(this.harga));
        System.out.println("Tahun keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas +"cc");
    }
}