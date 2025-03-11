import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String str = sc.nextLine().trim();
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0 ; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println("Chuỗi sau khi xử lý: " + result.toString().trim());
        sc.close();
    }
}