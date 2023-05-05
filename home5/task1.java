package homework.home5;


/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. 
Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге */


public class task1 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ирина", "8908");
        phonebook.add("Виктор", "8905");
        phonebook.add("Андрей", "8958");
        phonebook.add("Дмитрий", "8938");
        phonebook.add("Ирина", "8933");
        phonebook.add("Антон", "8922");
        phonebook.add("Дмитрий", "8945");


        System.out.println(phonebook.getAll());
        System.out.println();
        System.out.println(phonebook.print());
        System.out.println(phonebook.get("Ирина"));
        
    }
}
