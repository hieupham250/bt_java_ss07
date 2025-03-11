import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if (str.isEmpty()) {
            System.out.println("");
            return;
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            // Kiểm tra nếu ký tự tiếp theo giống ký tự hiện tại
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}
