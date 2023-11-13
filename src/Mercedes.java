public class Mercedes extends Car{
    private String cllass;

    public Mercedes(int year, String name, double engine, String cllass) {
        super(name, year, engine);
        this.cllass = cllass;
    }

    public String getCllass() {
        return cllass;
    }

    @Override
    public void print() {
        System.out.println("Year of issue: " + getYear() +
                "\nName: " + getName() +
                "\nEngine capacity: " + getEngine() +
                "\nClass: " + getCllass() +
                "\n__________" );

    }
}