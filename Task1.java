/**
 * Task1
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task1 {

  public static void main(String[] args) {
    System.out.print("Введите число, больше нуля: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    Random rnd = new Random();
    int[] arr = new int[num];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = rnd.nextInt(5 * num);
    }
    System.out.println(Arrays.toString(arr));

    for (int j = 0; j < arr.length - 1; j++) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                System.out.println(Arrays.toString(arr));
                String text = Arrays.toString(arr);
                try {
                    FileWriter writer = new FileWriter("D:/учеба/JAVA/seminar2/log.txt", true);
                    writer.write(text + "\n");
                    writer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
    sc.close();
  }
}