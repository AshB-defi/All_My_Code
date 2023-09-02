package virtual_pet;

public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int boredom;
    private int sleepiness;
    private boolean isSick;

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;  
        this.thirst = 50;  
        this.boredom = 50;  
        this.sleepiness = 50;  
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

    public int getSleepiness() {
        return this.sleepiness;
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
        this.sleepiness = Math.min(this.sleepiness + 10, 100);
    }

    public void putToSleep() {
        this.sleepiness = Math.max(this.sleepiness - 20, 0);
    }

    public void tick() {
        this.hunger = Math.min(this.hunger + 5, 100);
        this.thirst = Math.min(this.thirst + 5, 100);
        this.boredom = Math.min(this.boredom + 5, 100);
        this.sleepiness = Math.min(this.sleepiness + 5, 100);

        if (this.hunger >= 100 || this.thirst >= 100 || this.boredom >= 100 || this.sleepiness >= 100) {
            this.isSick = true;
        }
    }
}
