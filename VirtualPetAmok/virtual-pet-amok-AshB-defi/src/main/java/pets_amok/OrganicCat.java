package pets_amok;

public class OrganicCat extends Organic {
    protected int cleanLitterbox;
    private int happiness;

    public OrganicCat(String name) {
        super(name);
        this.cleanLitterbox = 100; 
    }

    public int getcleanLitterbox(){
        return this.cleanLitterbox;
    }

    public void setcleanLitterbox(int cleanLitterbox) {
        this.cleanLitterbox = cleanLitterbox;
    }

    public void cleanLitterbox() {
        this.cleanLitterbox = 100;
        this.happiness = Math.min(this.happiness + 10, 100);
    }


    public void tick() {
        super.tick(); 
        this.cleanLitterbox = Math.max(this.cleanLitterbox - 5, 0); 

        if (this.cleanLitterbox > 50) {
            this.happiness = Math.min(this.happiness + 10, 100);
        }
    }

}

