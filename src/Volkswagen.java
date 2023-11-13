public class Volkswagen extends  Car{
    private int speed;

    public Volkswagen(int year, String name, double engine, int speed) {
        super(name, year, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println("Year of issue: " + getYear() +
                "\nName: " + getName() +
                "\nEngine capacity: " + getEngine() +
                "\nSpeed: " + getSpeed() + " км/ч" +
                "\n__________" );

    }
}

