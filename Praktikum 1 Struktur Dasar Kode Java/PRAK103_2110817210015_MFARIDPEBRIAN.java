package praktikum1;
import java.util.Scanner;

public class PRAK103_2110817210015_MFARIDPEBRIAN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        int bilangan = in.nextInt();
        
        System.out.println("\nOutput: ");
        int i = 0;
        do {
            int bilangan_sementara = bilangan; 
            if (bilangan_sementara % 7 == 0){
                break;
            } else {
                System.out.print(bilangan);
            }
            bilangan--;
            i++;
            if (i < 5) {
                System.out.print(", ");
            }
        } while (i < 5);
        System.out.println();
    }    
}