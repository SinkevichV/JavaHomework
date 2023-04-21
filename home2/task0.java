/*Task_0
public class Task_0 {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {

}

public String findJewelsInStones(String jewels, String stones) {

return "";
}
}*/

public class task0 {
    public static void main(String[] args) {
        String str = "aaaAbbbB";
        String [] words = str.split("");
        char _letter1 = 'a', _letter2 = 'B';
        int count1=0, count2 = 0;
        for(int i = 0; i < words.length; i++) {
            if(words[i].indexOf(_letter1)!=-1)
            count1++;
        }
        for(int i = 0; i < words.length; i++) {
            if(words[i].indexOf(_letter2)!=-1)
            count2++;
        }
    System.out.print("a" +count1+ "B" +count2);
    }
}