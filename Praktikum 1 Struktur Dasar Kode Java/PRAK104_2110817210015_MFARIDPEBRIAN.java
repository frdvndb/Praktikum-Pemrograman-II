package praktikum1;
import java.util.Scanner;

public class PRAK104_2110817210015_MFARIDPEBRIAN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("----INPUT----");
        System.out.print("Kartu Andi: ");
        int ronde1Andi = in.nextInt();
        int ronde2Andi = in.nextInt();
        int ronde3Andi = in.nextInt();
        
        System.out.print("Kartu Budi: ");
        int ronde1Budi = in.nextInt();
        int ronde2Budi = in.nextInt();
        int ronde3Budi = in.nextInt();
        
        int pointAndi = 0;
        int pointBudi = 0;

        int[] arrayAndi = {ronde1Andi, ronde2Andi, ronde3Andi};
        int[] arrayBudi = {ronde1Budi, ronde2Budi, ronde3Budi};
 
        int i = 0;       
        int j = 0;
        int validasi = 0;
        
        while (i < 3){
            if (arrayAndi[i] > arrayBudi[i]){
                pointAndi++;
            }
            if (arrayAndi[i] < arrayBudi[i]){
                pointBudi++;
            }
            i++;
        }
               
        while (j < 3){
            if (arrayAndi[j] > 10 || arrayBudi[j] > 10 || arrayAndi[j] < 2 || arrayBudi[j] < 2){
                validasi = 1;
                break;
            }
            j++;
        }    
        System.out.println("\n----OUTPUT----");
        if (validasi == 0){
            if (pointAndi > pointBudi){
                System.out.println("Andi");
            }
            if (pointAndi < pointBudi){
                System.out.println("Budi");
            }
            if (pointAndi == pointBudi){
                System.out.println("Seri");
            }            
        } else {
            System.out.println("Input Salah");
        }
    }
}
