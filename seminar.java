/**
 * Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */
import java.util.Scanner;
public class seminar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите четное число: ");
        Integer number = scan.nextInt();
        System.out.print("\nПервый символ: ");
        char c1= scan.next().charAt(0);
        System.out.print("\nвторой символ: ");
        char c2= scan.next().charAt(0);
        scan.close();
       System.out.println(Concat(number,c1,c2));
    }


    public static String Concat(int num, char a, char b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< num/2; i++){
            sb.append(a);
            sb.append(b);
        }
        return sb.toString();
    
}
}