package homework.home6;
import java.util.*;

public class Notebook {

    private String Name;
    private int RAM;
    private int HD_Capacity;
    private String OS;
    private String color;
  
    public Notebook(String Name, int RAM, int HD_Capacity, String OS, String color) {
        this.Name = Name;
        this.RAM = RAM;
        this.HD_Capacity = HD_Capacity;
        this.OS = OS;
        this.color = color;
    }

    public Map<Integer, Object> ForFilter(){
        Map<Integer, Object> map = new HashMap<>();
        map.put(0, Name);
        map.put(1, RAM);
        map.put(2, HD_Capacity);
        map.put(3, OS);
        map.put(4, color);
        
        return map;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHD_Capacity() {
        return HD_Capacity;
    }
    
    public void setHD_Capacity(int HD_Capacity) {
        this.HD_Capacity = HD_Capacity;
    }

    public String getOS() {
        return OS;
    }
    
    public void setOS(String OS) {
        this.OS = OS;
    }
    public String getcolor() {
        return color;
    }
    
    public void setcolor(String color) {
        this.color = color;
    }
    public String getName() {
        return color;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }


    @Override
    public String toString() {
        return "Name: " + Name + ", RAM: " + RAM + ", HD_Capacity: " + HD_Capacity + ", OS: " + OS + ", color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Notebook)){
            return false;
        }
        Notebook Notebook = (Notebook)obj;
        return RAM ==Notebook.RAM && HD_Capacity == Notebook.HD_Capacity && OS.equals(Notebook.OS) && color.equals(Notebook.color);
    }

    @Override
    public int hashCode() {
        return 12*RAM + 7*HD_Capacity + 11*OS.hashCode() + 17*color.hashCode();
    }
}
    
