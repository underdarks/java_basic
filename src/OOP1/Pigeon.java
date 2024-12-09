package OOP1;

public class Pigeon extends Bird{

    public Pigeon() {
        this.name="피죤투";
    }

    @Override
    public void display() {
        System.out.println("name = " + name);
    }


}
