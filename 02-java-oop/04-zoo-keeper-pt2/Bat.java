public class Bat {

    public int energylevel = 1000;

    public String fly(){
        return "whooosh" + energylevel - 50;
    }
    public int eatHumans(){
        return energylevel + 10;
    }
    public static attackTown(String TownName){
        return "buuuuurrrrnn" + TownName + energylevel - 100;

    }
}