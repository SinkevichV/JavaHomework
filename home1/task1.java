/*
Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
Перейти по ссылке, реализовать формулу на Java.
 */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
        System.out.println("введите n (натуральное число): ");
        String f = sc.nextLine();
        int n = Integer.parseInt(f);
        int counter = 0;
        int TrianNum = 0;

       
        while (counter <= n) {
            if (n != 0) {
                TrianNum = TrianNum + counter;
                counter++;
            } else {
                System.out.println("введите натуральное число");
                break; 
            }   
        }
        System.out.println(TrianNum);
    }
    
}