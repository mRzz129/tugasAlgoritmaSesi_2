import java.util.Scanner;

public class gajihDanLembur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Gaji: ");
        double gaji = input.nextDouble();
        
        System.out.print("Jam Lembur: ");
        int jamLembur = input.nextInt();
        
        System.out.print("Upah Lembur per Jam: ");
        double upahLembur = input.nextDouble();
        
        double gajiLembur = jamLembur * upahLembur;
        double totalGaji = gaji + gajiLembur;
        
        System.out.println("Gaji yang Diterima: " + totalGaji);
    }
}
