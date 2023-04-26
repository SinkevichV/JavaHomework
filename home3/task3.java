import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке. */
public class task3 {
    public static void main(String[] args) {
        

        List<String> sunSystem = new ArrayList<>();
        List<String> newPlanets = new ArrayList<>();

            addPlanet(sunSystem, "Меркурий");
            addPlanet(sunSystem, "Венера");
            addPlanet(sunSystem, "Земля");
            addPlanet(sunSystem, "Марс");
            addPlanet(sunSystem, "Юпитер");
            addPlanet(sunSystem, "Сатурн");
            addPlanet(sunSystem, "Уран");
            addPlanet(sunSystem, "Нептун");
            addPlanet(sunSystem, "Плутон");

            System.out.println(listPlanet(sunSystem, newPlanets, 15));    
            counterPlanet(newPlanets, sunSystem );
    }
    
    
    static void addPlanet(List<String> sunSystem, String name){
        sunSystem.add(name);
    }
    

    static List<String> listPlanet(List<String> sunSystem,List<String> newPlanets, int elementCount) {
        var random = new Random();
        var list = new ArrayList<>(sunSystem);
        
        for (int i = 0; i < elementCount; i++) {
            int randomIndex = random.nextInt(list.size());
            
            newPlanets.add(list.get(randomIndex));                   
        }
        return newPlanets; 
    }


    static void counterPlanet(List<String> newPlanets, List<String>sunSystem){
            for (int i = 0; i < sunSystem.size(); i++) {
                System.out.println(sunSystem.get(i)+ ":" + Collections.frequency(newPlanets, sunSystem.get(i)));
                
            }  
                
    }            
}


