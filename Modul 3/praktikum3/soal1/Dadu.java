package praktikum3.soal1;

import java.util.LinkedList;

public class Dadu {
    private int nilaiDadu;
    
    public int getNilaiDadu() {
        return nilaiDadu;
    }
    
    public void setNilaiDadu(int nilaiDadu) {
        this.nilaiDadu = nilaiDadu;
    }
    
    public int AcakNilai(){
        setNilaiDadu((int) Math.floor(Math.random()*(6-1+1)+1));
        return getNilaiDadu();
    }
}