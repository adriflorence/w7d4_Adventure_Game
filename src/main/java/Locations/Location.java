package Locations;

public abstract class Location {

    String name;
    String description;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
