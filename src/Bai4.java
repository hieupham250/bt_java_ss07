import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String str = sc.nextLine().trim();
        str = str.toLowerCase();
        String sb = new StringBuilder(str).reverse().toString();
        if (str.equals(sb)) {
            System.out.println("chuỗi đối xứng");
        } else {
            System.out.println("chuỗi không đối xứng");
        }
        sc.close();
    }
}
