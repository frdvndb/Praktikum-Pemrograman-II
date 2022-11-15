package praktikum4.soal2;

public class Novel extends Buku{
    private String genre, sinopsis;
    
    public Novel (String j, String p, String t, String g, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        genre = g;
        sinopsis = s;
    }  
    public String getNovelDetail(){
        String[] genreSplit  = genre.split(" ");
        String genreKapitalHurufPertama = "";
        for (String temp: genreSplit){
            genreKapitalHurufPertama = genreKapitalHurufPertama + temp.substring(0,1).toUpperCase() + temp.substring(1).toLowerCase() + " ";
        }           
        return "Sebuah novel bergenre " + genreKapitalHurufPertama + 
                "dengan judul \"" + judul + "\".\nNovel tersebut ditulis oleh " + penulis 
                + " dan diterbitkan pada tahun " + tahun + "."
                + "\nSinopsis: " + sinopsis.substring(0,59) + "....";
    }   
}