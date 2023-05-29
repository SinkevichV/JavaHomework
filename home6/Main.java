package homework.home6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Notebook note1 = new Notebook("note1", 4, 128, "Windows 10", "Black");
        Notebook note2 = new Notebook("note2", 8, 256, "Windows 8", "White");
        Notebook note3 = new Notebook("note3", 16, 512, "Ubuntu", "Red");
        Notebook note4 = new Notebook("note4", 32, 1024, "No OS", "Silver");
        Notebook note5 = new Notebook("note5", 32, 512, "Windows 11", "Black");
        Notebook note6 = new Notebook("note6", 16, 1024, "Ubuntu", "Silver");
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
        System.out.println(note4);

        Set<Notebook> notes = new HashSet<>();
        Map<Integer, Object> ParametrsFiltr = new HashMap<>();

        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        notes.add(note4);
        notes.add(note5);
        notes.add(note6);
        System.out.println(notes);
        System.out.println(note1.ForFilter());
        StartMenu(notes, ParametrsFiltr);

    }

    public static Map<Integer, Object> StartMenu(Set<Notebook> notes, Map<Integer, Object> ParametrsFiltr) {

        System.out.println("Введите цифру нужного пункта меню:\n" +
                "1.Объем оперативной памяти: \n" +
                "2.Объем жесткого диска\n" +
                "3.Операционная система\n" +
                "4.Цвет\n" +
                "5.Подбор ноутбука по параметрам\n" +
                "6.Выйти");
        Scanner sc = new Scanner(System.in);
        Integer NumStringMenu = sc.nextInt();
        switch (NumStringMenu) {
            case 1:
                RAMMenu(ParametrsFiltr, notes);
                break;
            case 2:
                HDMenu(ParametrsFiltr, notes);
                break;
            case 3:
                OSMenu(ParametrsFiltr, notes);
                break;
            case 4:
                colorMenu(ParametrsFiltr, notes);
                break;
            case 5:
                System.out.println(SelectNotebook(notes, ParametrsFiltr));
            case 6:
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return ParametrsFiltr;
        }
        return ParametrsFiltr;
    }

    public static Map<Integer, Object> RAMMenu(Map<Integer, Object> ParametrsFiltr, Set<Notebook> notes) {
        System.out.println("Введите цифру нужного пункта меню:\n" +
                "1.Объем оперативной памяти 4 Гб\n" +
                "2.Объем оперативной памяти 8 Гб\n" +
                "3.Объем оперативной памяти 16 Гб\n" +
                "4.Объем оперативной памяти 32 Гб\n" +
                "5.Вернуться в начальное меню");

        Scanner sc = new Scanner(System.in);
        Integer NumString = sc.nextInt();
        switch (NumString) {
            case 1:
                ParametrsFiltr.put(1, 4);
                return StartMenu(notes, ParametrsFiltr);
            case 2:
                ParametrsFiltr.put(1, 8);
                return StartMenu(notes, ParametrsFiltr);
            case 3:
                ParametrsFiltr.put(1, 16);
                return StartMenu(notes, ParametrsFiltr);
            case 4:
                ParametrsFiltr.put(1, 32);
                return StartMenu(notes, ParametrsFiltr);
            case 5:
                StartMenu(notes, ParametrsFiltr);
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return ParametrsFiltr;
        }
        return ParametrsFiltr;
    }

    public static Map<Integer, Object> HDMenu(Map<Integer, Object> ParametrsFiltr, Set<Notebook> notes) {
        System.out.println("Введите цифру нужного пункта меню:\n" +
                "1.Объем жесткого диска 128 Гб\n" +
                "2.Объем жесткого диска 256 Гб\n" +
                "3.Объем жесткого диска 512 Гб\n" +
                "4.Объем жесткого диска 1024 Гб\n" +
                "5.Вернуться в начальное меню");

        Scanner sc = new Scanner(System.in);
        Integer NumString = sc.nextInt();
        switch (NumString) {
            case 1:
                ParametrsFiltr.put(2, 128);
                return StartMenu(notes, ParametrsFiltr);
            case 2:
                ParametrsFiltr.put(2, 256);
                return StartMenu(notes, ParametrsFiltr);
            case 3:
                ParametrsFiltr.put(2, 512);
                return StartMenu(notes, ParametrsFiltr);
            case 4:
                ParametrsFiltr.put(2, 1024);
                return StartMenu(notes, ParametrsFiltr);
            case 5:
                StartMenu(notes, ParametrsFiltr);
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return ParametrsFiltr;
        }
        return ParametrsFiltr;
    }

    public static Map<Integer, Object> OSMenu(Map<Integer, Object> ParametrsFiltr, Set<Notebook> notes) {
        System.out.println("Введите цифру нужного пункта меню:\n" +
                "1.Операционная система: NO OS\n" +
                "2.Операционная система: Windows 8\n" +
                "3.Операционная система: Windows 10\n" +
                "4.Операционная система: Windows 11\n" +
                "5.Операционная система: Ubuntu\n" +
                "6.Вернуться в начальное меню");

        Scanner sc = new Scanner(System.in);
        Integer NumString = sc.nextInt();
        switch (NumString) {
            case 1:
                ParametrsFiltr.put(3, "NO OS");
                return StartMenu(notes, ParametrsFiltr);
            case 2:
                ParametrsFiltr.put(3, "Windows 8");
                return StartMenu(notes, ParametrsFiltr);
            case 3:
                ParametrsFiltr.put(3, "Windows 10");
                return StartMenu(notes, ParametrsFiltr);
            case 4:
                ParametrsFiltr.put(3, "Windows 11");
                return StartMenu(notes, ParametrsFiltr);
            case 5:
                ParametrsFiltr.put(3, "Ubuntu");
                return StartMenu(notes, ParametrsFiltr);
            case 6:
                StartMenu(notes, ParametrsFiltr);
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return ParametrsFiltr;
        }
        return ParametrsFiltr;
    }

    public static Map<Integer, Object> colorMenu(Map<Integer, Object> ParametrsFiltr, Set<Notebook> notes) {
        System.out.println("Введите цифру нужного пункта меню:\n" +
                "1.Цвет: Black\n" +
                "2.Цвет: Silver\n" +
                "3.Цвет: Red\n" +
                "4.Цвет: White\n" +
                "5.Вернуться в начальное меню");

        Scanner sc = new Scanner(System.in);
        Integer NumString = sc.nextInt();
        switch (NumString) {
            case 1:
                ParametrsFiltr.put(4, "Black");
                return StartMenu(notes, ParametrsFiltr);
            case 2:
                ParametrsFiltr.put(4, "Silver");
                return StartMenu(notes, ParametrsFiltr);
            case 3:
                ParametrsFiltr.put(4, "Red");
                return StartMenu(notes, ParametrsFiltr);
            case 4:
                ParametrsFiltr.put(4, "White");
                return StartMenu(notes, ParametrsFiltr);
            case 5:
                StartMenu(notes, ParametrsFiltr);
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return ParametrsFiltr;
        }
        return ParametrsFiltr;
    }

    public static Notebook SelectNotebook(Set<Notebook> notes, Map<Integer, Object> ParametrsFiltr) {
        Notebook valueNotebook;
        for (Notebook note : notes) {
            System.out.println(note);

            if (note.ForFilter().get(1) == ParametrsFiltr.get(1)) {
                valueNotebook = note;
            } else if (note.ForFilter().get(2) == ParametrsFiltr.get(2)) {
                valueNotebook = note;
            } else if (note.ForFilter().get(3).equals(ParametrsFiltr.get(3))) {
                valueNotebook = note;
            } else if (note.ForFilter().get(4).equals(ParametrsFiltr.get(4))) {
                valueNotebook = note;
            } else {
                continue;
            }
            return valueNotebook;
            
        }
        return valueNotebook;
        

    }
}

