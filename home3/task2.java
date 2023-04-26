import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.transform.Result;
/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
 */
public class task2 {
    public static void main(String[] args){
        List<Integer> list = createList(10, 0, 10);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        mean(list); 
    }

    static void mean(List<Integer> list){
        Double result = (double) 0;
        Double average = (double) 0;
        for (int i = 0; i < list.size(); i++) {
            result+= list.get(i);
        }
        average = (double)(result/list.size());
        System.out.println(average);
        
    }
    static List<Integer> createList ( int capacity, int min, int max){
            List<Integer> result = new ArrayList<>(capacity);
            for (int i = 0; i < capacity; i++) {
                result.add((int) (Math.random() * (max - min + 1) + min));
            }
            return result;
    }
    
}
