import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        String rotate_str = "";
        if (k > str.length())
            k = k % str.length();
        System.out.println(k);
        for (int i = k; i < str.length(); i++) {
            rotate_str += str.charAt(i);
        }
        for (int i = 0; i < k; i++) {
            rotate_str += str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Rotated String: " + rotate_str);
    }
}