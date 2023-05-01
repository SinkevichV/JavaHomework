package homework.home4;
import java.util.*;
/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
который вернет “перевернутый” список. Постараться не обращаться к листу по индексам. */

public class task1 {
    public static void main(String[] args) {
        ex1();
    }

    
    static void ex1(){
      
        LinkedList<Integer> linked = new LinkedList<>();
        LinkedList<Integer> linked2 = new LinkedList<>();
        linked.add(1);
        linked.add(2);
        linked.add(3);
        linked.add(4);
        
        System.out.println(linked);
        ListIterator<Integer> iterator = linked.listIterator(linked.size());
        while (iterator.hasPrevious()){
            linked2.add(iterator.previous());
            
        }
        System.out.println(linked2);
    }
}       
