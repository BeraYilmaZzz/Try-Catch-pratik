import java.util.Scanner;

public class Main {
    public static int getElementAtIndex(int index, int[] arr) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Dizi boyutundan fazla indeks girilmiştir!!");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("İndeks giriniz = ");
        int index = scan.nextInt();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            getElementAtIndex(index, arr);
            System.out.println("Dizinin " + index + ". elemanı = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program bitti");
    }
}