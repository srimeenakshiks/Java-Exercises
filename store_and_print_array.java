import java.util.Scanner;
public class ex2 {
public static void main(String args[]) { Scanner input = new Scanner(System.in); int s = input.nextInt();
int[] array = new int[s]; for(int i=0; i<s; i++) { array[i] = input.nextInt();
}
for(int i=0; i<s; i++) {
System.out.print(array[i] + " ");
}
