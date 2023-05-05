package homework.home5;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, 
Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, 
Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, 
Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности. Для сортировки использовать TreeMap. */
public class task2 {
        public static void main(String[] args) {
            String line = "Иван Иванов, Светлана Петрова, Кристина Белова, "+ 
            "Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, "+
            "Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, "+ 
            "Петр Петин, Иван Ежов";
            line = line.replace(",", "");
            line = line.replace("\n", " ");
            String[] words = line.split(" ");
            List<String> employees = Arrays.asList(words);   
            Map<String, Integer> nameCount = new TreeMap<>(Comparator.naturalOrder());
    
            for (String employee : employees) {
                String name = employee.split(" ")[0];
                nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
            }
    
            for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " - " + entry.getValue() + " повторений");
                }
            }
        }
    }
    

