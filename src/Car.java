public abstract class Car implements Printable{
    private String name;
    private int year;
    private double engine;

    public Car( String name, int year, double engine) {
        this.name = name;
        this.year = year;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public abstract void print();
}