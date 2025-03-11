import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine().trim();
        do {
            System.out.println("===== MENU QUẢN LÝ CHUỖI =====");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi toàn bộ chỗi thành chữ hoa/chữ thường");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    StringBuilder result = new StringBuilder(str);
                    result.reverse();
                    System.out.println(result.toString());
                    break;
                case 2:
                    System.out.print("Nhập chuỗi cần chèn: ");
                    String insertStr = sc.nextLine();
                    System.out.print("Nhập vị trí cần chèn: ");
                    int insertPos = sc.nextInt();
                    if (insertPos < 0 || insertPos > str.length()) {
                        System.out.println("Vị trí không hợp lệ!");
                    } else {
                        str = new StringBuilder(str).insert(insertPos, insertStr).toString();
                        System.out.println("Chuỗi sau khi chèn: " + str);
                    }
                    break;
                case 3:
                    System.out.print("Nhập vị trí bắt đầu cần xóa: ");
                    int start = sc.nextInt();
                    System.out.print("Nhập vị trí kết thúc cần xóa: ");
                    int end = sc.nextInt();
                    if (start < 0 || end > str.length() || start >= end) {
                        System.out.println("Vị trí không hợp lệ! Hãy nhập lại.");
                    } else {
                        str = new StringBuilder(str).delete(start, end).toString();
                        System.out.println("Chuỗi sau khi xóa: " + str);
                    }
                    break;
                case 4:
                    System.out.print("Nhập đoạn cần thay thế: ");
                    String oldStr = sc.nextLine();
                    System.out.print("Nhập chuỗi mới: ");
                    String newStr = sc.nextLine();
                    if (!str.contains(oldStr)) {
                        System.out.println("Chuỗi cần thay thế không tồn tại!");
                    } else {
                        str = str.replace(oldStr, newStr);
                        System.out.println("Chuỗi sau khi thay thế: " + str);
                    }
                    break;
                case 5:
                    System.out.println("1. Chuyển thành chữ hoa");
                    System.out.println("2. Chuyển thành chữ thường");
                    int subChoice = sc.nextInt();
                    switch (subChoice) {
                        case 1:
                            System.out.println("Chuỗi in hoa " + str.toUpperCase());
                            break;
                        case 2:
                            System.out.println("Chuỗi Chữ thường " + str.toLowerCase());
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Đã thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (true);
    }
}
