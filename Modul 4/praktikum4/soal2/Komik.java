package praktikum4.soal2;

public class Komik extends Buku{
    private int volume;
    private String sinopsis;
    
    public Komik (String j, String p, String t, String v, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        volume = Integer.valueOf(v);
        sinopsis = s;
    }    
    public String getKomikDetail(){
        return "Sebuah komik dengan judul: \"" + judul 
                + "\".\nKomik tersebut dibuat oleh " + penulis 
                + " dan diterbitkan pada tahun " + tahun 
                + ".\nSampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah\n"
                + "Sinopsis: "+ sinopsis.substring(0,64) + "....";
    }
}