package pets_amok;

public class RoboticDog extends Robotic {
    private int cageCleanliness;
    private int happiness;
    

    public RoboticDog(String name) {
        super(name);
        this.cageCleanliness = 100; 
    }

    public int getCageCleanliness() {
        return this.cageCleanliness;
    }

    public void cleanCage() {
        this.cageCleanliness = 100;
        this.happiness = Math.min(this.happiness + 10, 100);
    }

    public void walk() {
        System.out.println("You walk with the robotic dog!");
        this.happiness = Math.min(this.happiness + 20, 100); 
    }

    public void play() {
        super.play();
        System.out.println("You play fetch with the robotic dog!");
    }

    public void oilMaintenance() {
        super.oilMaintenance();
        this.happiness += 10;
    }

    public void tick() {
        super.tick();
        this.cageCleanliness = Math.max(this.cageCleanliness - 5, 0);
    }
}
