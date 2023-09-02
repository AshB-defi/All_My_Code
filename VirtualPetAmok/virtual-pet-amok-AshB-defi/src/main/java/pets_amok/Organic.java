package pets_amok;

public abstract class Organic extends VirtualPet {
    private int hunger;
    private int thirst;
    private int health;
    private int happiness;

    public Organic(String name) {
        super(name);
        this.hunger = 0;
        this.thirst = 0;
        this.health = 100;
        this.happiness = 100; 
    }

    public void feed() {
        hunger -= 10;
        if(hunger < 0) hunger = 0;
        happiness += 10;
        if(happiness > 100) happiness = 100;
    }

    public void giveWater() {
        thirst -= 10;
        if(thirst < 0) thirst = 0;
        happiness += 5;
        if(happiness > 100) happiness = 100;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }
}

