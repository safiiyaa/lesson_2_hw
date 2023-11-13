public class Toyota extends Car{
    private String driving;

    public Toyota(int year, String name, double engine, String driving) {
        super(name, year, engine);
        this.driving = driving;
    }

    public String getDriving() {
        return driving;
    }

    @Override
    public void print() {
        System.out.println("Year of issue: " + getYear() + "\nName: "
                + getName() + "\nEngine capacity: "
               + getEngine() + "\nDrive unit: "
                + getDriving() + "\n__________" );

    }

}
