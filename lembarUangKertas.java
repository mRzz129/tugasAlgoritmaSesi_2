import java.util.Scanner;

public class lembarUangKertas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nominal: ");
        int nominal = input.nextInt();
        
        int sisa = nominal;
        
        int limaPuluhRibuan = sisa / 50000;
        sisa = sisa % 50000;
        
        int duaPuluhRibuan = sisa / 20000;
        sisa = sisa % 20000;
        
        int limaRibuan = sisa / 5000;
        sisa = sisa % 5000;
        
        int duaRibuan = sisa / 2000;
        sisa = sisa % 2000;
        
        int limaRatus = sisa / 500;
        sisa = sisa % 500;
        
        System.out.println(limaPuluhRibuan + " lembar 50ribuan");
        System.out.println(duaPuluhRibuan + " lembar 20ribuan");
        System.out.println(limaRibuan + " lembar 5ribuan");
        System.out.println(duaRibuan + " lembar 2ribuan");
        System.out.println(limaRatus + " keping 500an");
    }
}
