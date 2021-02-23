public class Project {
    private String name;
    private String description;
    private static String defaultName = "Default NAME";
    private static String defaultDesc = "Default DESC";


    //getters
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    //setter

    public void setName(String name){
        name = this.name;
    } 

    public void setDescription(String description){
        description = this.description;
    }

    
    public String ElevatorPitch() {
        return String.format("%s ; %s", name, description);
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Project(String name) {
        this.name = name;
        this.description = defaultDesc;
    }
    public Project() {
        name = defaultName;
        description = defaultDesc;
    }

    
}