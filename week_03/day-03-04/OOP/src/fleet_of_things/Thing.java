package fleet_of_things;

public class Thing {
    private String name;
    private boolean completed;

    public Thing(String name) { //make a thing to add it to the fleet
        this.name = name;
    }

    public void complete() { //Call when thing is completed
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name; // if thing is completed put x if false empty + thing's name
    }
}
