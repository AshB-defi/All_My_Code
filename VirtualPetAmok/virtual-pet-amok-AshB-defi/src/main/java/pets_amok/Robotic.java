package pets_amok;

public class Robotic extends VirtualPet {
    protected int oilLevel;
    private int happiness;
    private int boredom;

    public Robotic(String name) {
        super(name);
        this.oilLevel = 100;
    }

    public int getOilLevel(){
        return this.oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public void oilMaintenance() {
        this.oilLevel = 100;
        this.happiness = Math.min(this.happiness + 10, 100);
    }

    public void play() {
        this.boredom = Math.max(this.boredom - 10, 0);
        this.happiness = Math.min(this.happiness + 10, 100);
    }

    public void tick() {
        super.tick();
        this.oilLevel = Math.max(this.oilLevel - 5, 0);
    }
}
