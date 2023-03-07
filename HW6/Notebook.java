package HW6;

public class Notebook {
    
    private String model;
    private String color;
    private String os;
    private Integer ramGb;
    private Integer romGb;

    public void getInfo() {
        System.out.println(this.model + "\nЦвет: " + 
                           this.color + "\nОперационная система: " + 
                           this.os + "\nОперативная память: " + 
                           this.ramGb + "\nОбъем HDD: " + 
                           this.romGb + "\n");
    }

    public Notebook() {
        this.model = null;
        this.color = null;
        this.os = null;
        this.ramGb = 0;
        this.romGb = 0;
    }

    public Notebook(String model, String color, String os, Integer ramGb, Integer romGb) {
        this.model = model;
        this.color = color;
        this.os = os;
        this.ramGb = ramGb;
        this.romGb = romGb;
    }

    public int getRam() {
        return this.ramGb;
    }
    public int getRom() {
        return this.romGb;
    }
    public String getOs() {
        return this.os;
    }
    public String getColor() {
        return this.color;
    }
    
    @Override
    public String toString() {
        return "Notebook model: " + this.model + ", color: " + this.color + ", OS: " + this.os + ", RAM: " + this.ramGb + ", ROM: " + this.romGb;
    }
}