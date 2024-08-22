import java.util.Scanner;

public class Bai6 {

    static void TinhLuongQuaThue(double luong) {
        double luongquathue = 0;
        double thue=0;
        if (luong > 15000000) {
            luongquathue = luong-luong * 0.3;
            thue=luong * 0.3;
        } else if (luong >= 7000000 && luong <= 15000000) {
            luongquathue = luong-luong*0.2;
            thue=luong * 0.2;
        } else if (luong <= 7000000) {
            luongquathue = luong-luong * 0.1;
            thue=luong * 0.1;
        }
        
        System.out.println("Luong qua thue: " + luongquathue);
        System.out.println("Thue: " + thue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double luong;
        
        System.out.print("Nhap luong: ");
        luong = sc.nextDouble();
        
        TinhLuongQuaThue(luong);
    }
}
