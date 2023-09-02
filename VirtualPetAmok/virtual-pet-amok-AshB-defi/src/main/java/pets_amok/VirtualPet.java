package pets_amok;

public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int boredom;
    private int happiness;
    private int health;
    private boolean isSick;
    public Object increaseHappiness;

    

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;  
        this.thirst = 50;  
        this.boredom = 50;
        this.happiness = 50;
        this.health = 100;  
        this.isSick = false;
    }

    public String getName() {
        return this.name;    
    }

    public int getHunger() {
        return this.hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public int getBoredom() {
        return this.boredom;  
    }
    
    public int getHappiness() {
        return this.happiness;
    }

    public int getHealth () {
        return this.health;
    }
    
    public boolean isSick() {
        return this.isSick;
    }

    public void feed() {
        this.hunger = Math.max(this.hunger - 10, 0);
    }

    public void giveWater() {
        this.thirst = Math.max(this.thirst - 10, 0);
    }

    public void play() {
        this.boredom = Math.max(this.boredom - 10, 0);
    }

    public void tick() {
        this.hunger = Math.min(this.hunger + 5, 100);
        this.thirst = Math.min(this.thirst + 5, 100);
        this.boredom = Math.min(this.boredom + 5, 100);
        this.happiness = Math.max(this.happiness -5, 0);
        this.health = Math.max(this.health -5, 0);

        if (this.hunger >= 100 || this.thirst >= 100 || this.boredom >= 100 || this.happiness <= 0) {
            this.isSick = true;
        }
    }

    public void playWithPet() {
    }

    public void useLitterBox() {
    }

}
