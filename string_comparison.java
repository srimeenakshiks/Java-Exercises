import java.util.Scanner;
public class ex2 {
public static void main(String args[]) { Scanner input = new Scanner(System.in); String a = input.nextLine().toLowerCase(); String b = input.nextLine().toLowerCase(); int flag = 0;
if (a.length() == b.length()) { for (int i=0; i<a.length(); i++) { for (int j = 0; j < b.length(); j++) { if (a.charAt(i) == b.charAt(j)) { flag += 1;
} else {
System.out.println("String length do not match and hence not all elements present
in one element is present in the other.");
}
if (flag == a.length()) { System.out.println("True");
} else {
System.out.println("False");
}
