package homework.home4;
import java.util.LinkedList;
import java.util.ListIterator;


/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */
public class task3 {
    public static void main(String[] args) {
        ex1();
    }

    
    static void ex1(){
      
        LinkedList<Integer> linked = new LinkedList<>();
        int summ = 0;
        linked.add(1);
        linked.add(2);
        linked.add(3);
        linked.add(4);
        
        System.out.println(linked);
        ListIterator<Integer> iterator = linked.listIterator(linked.size());
        while (iterator.hasPrevious()){
            summ+= iterator.previous();
            
        }
        System.out.println(summ);
    }
}
