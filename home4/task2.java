package homework.home4;
/*Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - 
возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */
import java.util.LinkedList;
import java.util.Deque;

public class task2 {
    public static void main(String[] args) {
        ex2();
    }

    
    static void ex2(){
      

        Deque<Integer> q = new LinkedList<>();

        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.addLast(4);

        System.out.println(q);
        System.out.println(q.peekFirst());
        System.out.println(q);
        System.out.println(q.pollFirst());
        System.out.println(q);
    }
}

