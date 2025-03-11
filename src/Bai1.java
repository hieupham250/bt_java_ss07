import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi 1: ");
        String str1 = sc.nextLine().trim();
        System.out.print("nhập chuỗi 2: ");
        String str2 = sc.nextLine().trim();
        System.out.print("nhập chuỗi 3: ");
        String str3 = sc.nextLine().trim();
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(" ").append(str2);
        sb.append(" ").append(str3);
        System.out.println(sb.toString().toUpperCase());
        sc.close();
    }
}
