/*Вывести все простые числа от 1 до 1000 */

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
        System.out.println("введите n (натуральное число): ");
        String f = sc.nextLine();
        int n = Integer.parseInt(f);
     
        for (int i = 1; i <= n; i++) {
        boolean isPrime = true;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                if ((i % j) == 0) { 
                isPrime = false;
                break;
                }
            }
            if (isPrime){
            System.out.print(i + " ");
            }
        }
    }             
}