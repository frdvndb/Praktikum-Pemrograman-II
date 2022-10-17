package PRAK201_2110817210015_MFARIDPEBRIAN;

public class BuahDriver {
    public static void main(String[] args) {
      Buah manggaArumanis = new Buah("Arumanis", "hijau kekuning-kungingan", "lembut", "manis", 0.3, 13, 5000);
      Buah manggaManalagi = new Buah("Manalagi", "hijau", "kasar", "manis", 0.5, 17, 7500);
      Buah manggaMadu     = new Buah("Madu", "kuning", "lembut", "manis ", 0.375, 12, 6500);
      
      manggaArumanis.displayBuahStatus();
      manggaManalagi.displayBuahStatus();
      manggaMadu.displayBuahStatus();
    }    
}