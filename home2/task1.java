/*
 * Task_1
public class Task_1 {

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
public static void main(String[] args) {

}

public String shuffle(final String s, final int[] index){

return "";
 */

 public class task1 {
    public static void main(String[] args) {
        String S = "cba";
        int [] index = {3,2,1};
        String[] letters = S.split("");
        int count = 0;
        String result = "";
        for (int i = 0; count < letters.length; i++) {
            i = index[count]-1;
            result = result + letters[i];
            count++;
        }    
        System.out.println(result); 
   }
}