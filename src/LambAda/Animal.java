package LambAda;

public class Animal {
    private String species;
    private boolean canHope;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species=speciesName;
        canHope=hopper;
        canSwim=swimmer;
    }

    public boolean CanHop() {return canHope;}
    public boolean CanSwim() {return canSwim;}
    public String toString() {return species;}

}

