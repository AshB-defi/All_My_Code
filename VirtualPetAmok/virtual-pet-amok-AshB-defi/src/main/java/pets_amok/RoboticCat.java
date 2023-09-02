package pets_amok;

public class RoboticCat extends Robotic {
    private int happiness;

    public RoboticCat(String name) {
        super(name);
    }

    public void oilMaintenance() {
        System.out.println("You're applying oil maintenance to the robotic cat.");
        this.happiness = Math.min(this.happiness + 10, 100); 
    }

    public void play() {
        super.play();
        System.out.println("You play with the robotic cat!");
    }
}
