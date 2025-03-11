import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("chuỗi ban đầu: " + sb.toString());
        sb.delete(5, 9);
        System.out.println("chuỗi sau khi xóa: " + sb.toString());
        sb.replace(8,13 ,"Universe");
        System.out.println("chuỗi sau khi thay thế: " + sb.toString());
    }
}
