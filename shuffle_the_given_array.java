import java.util.Scanner;
public class ex2 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in); int n = input.nextint();
int[] array = new int[n];
for (int i = 0; i < n; i++) { array[i] = input.nextInt();
}
for (int i = 0; i < n; i++) {
}
int c = (int) (Math.random() * (n-0 + 1) + 0); int t = array[i];
array[i] = array[c];
array[c] = t;
for (int i = 0; i < n; i++) {
System.out.print(array[i] + " ");
}
