package praktikum1;
import java.util.Scanner;

public class PRAK102_2110817210015_MFARIDPEBRIAN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        int bilangan = in.nextInt();
        
        System.out.println("\nOutput: ");
        int i = 0;
        while (i < 7){
            int bilangan_sementara = bilangan; 
            if (bilangan_sementara % 2 == 0){
                bilangan_sementara = bilangan_sementara/2;
                bilangan_sementara = bilangan_sementara - 1;
            }
            System.out.print(bilangan_sementara);
            bilangan++;
            i++;
            if (i < 7) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}