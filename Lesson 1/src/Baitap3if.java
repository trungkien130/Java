
import java.util.Scanner;

public class Baitap3if {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n;
        double thanhtien=0;
        System.err.print("Nhap so dien tieu thu:");
        n=sc.nextInt();
        if(n >= 1 && n <= 100) {
            thanhtien = n*550;
        } else if (n > 100 && n <= 150) {
            thanhtien = 100*550+ (n-100)*750;
        } else if (n > 150 && n <= 200) {
            thanhtien = 100*550+50*750 + (n-150)*950;
        } else if (n > 200) {
            thanhtien = 100*550+50*750+50*950 + (n-200)*1350;
            
        }
    System.out.println(thanhtien*1.1);
    }
}
