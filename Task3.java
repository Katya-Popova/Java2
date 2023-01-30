//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String r= " ";
        for (int i=0, j=s.length()-1; i<s.length()/2; i++,j--){
            if (s.charAt(i)==s.charAt(j)){
                r= "Палиндром";
            } 
            else {
                r= "Не палиндром";
            }

        }
        System.out.println(r);
        
    }
}
