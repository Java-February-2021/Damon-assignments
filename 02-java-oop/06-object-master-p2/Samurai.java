public class Samurai extends Human {
    public Samurai() {
        this.health = 200;
    }

    public void deathBlow(Human target){
        target.health = 0;
    }

    public void meditate(){
        this.health += this.health/2;
    }

    private int numofSamurai =0;

    public void howMany(){
        return Samurai.numofSamurai;
        System.out.println(Samurai.numofSamurai);
    }
}

