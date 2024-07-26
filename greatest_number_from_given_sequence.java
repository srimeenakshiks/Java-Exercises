import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); int n = input.nextInt();
int a = 0; do {
int b = input.nextInt(); if (b> a) { a = b; n-;
}
} while (n> 1);
System.out.println("The greatest number is " + a);
}
