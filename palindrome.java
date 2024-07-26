import java.util.Scanner;
public class Main {
public static void main(String[] args) { Scanner input = new Scanner(System.in); String str = input.nextLine();
str = str.toLowerCase();
boolean flag = true;
int i=0,j= str.length()-1; while (i <j) {
if (str.charAt(i) != str.charAt(j)) { flag = false; break;
}
i++;
-
flag = true;
}
if (flag) {
System.out.print("Palindrome");
} else {
System.out.print("Not a Palindrome");
}
}
}
