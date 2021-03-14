public class Ninja extends Human {
    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human target){
        target.health -= this.stealth;
    }

    public void runaway(Human target){
        this.health -= 10;
    }
}


