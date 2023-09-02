package pets_amok;

public class OrganicDog extends Organic {
    private int cageCleanliness;
    private int happiness;

    public OrganicDog(String name) {
        super(name);
        this.cageCleanliness = 100;
    }

    public int getCageCleanliness(){
        return this.cageCleanliness;
    }

    public void setCageCleanliness(int cageCleanliness) {
        this.cageCleanliness = cageCleanliness;
    }

    public void cleanCage() {
        this.cageCleanliness = 100;
        this.happiness = Math.min(this.happiness + 10, 100);
    }

    public void walk() {
        this.happiness = Math.min(this.happiness + 10, 100);
    }

    public void tick() {
        super.tick();
        this.cageCleanliness = Math.max(this.cageCleanliness - 5, 0);
    }
}
