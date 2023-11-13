public class Main {
    public static Car createObject(String className) {
        switch (className) {
            case "Car1":
                return new Mercedes(1927, "Mercedes-Benz ", 4.2, "S-class");

            case "Car2":
                return new Volkswagen(1938, "Volkswagen Passat B3", 3.3, 200);

            case "Car3":
                return new Toyota(1936, "Toyota Camry", 3.0, "Front-wheel drive");

            default:
                throw new IllegalArgumentException("Error:");
        }
    }

    public static void main(String[] args) {
        Car car1 = createObject("Car1");
        Car car2 = createObject("Car2");
        Car car3 = createObject("Car3");

        Printable[] car = {car1, car2, car3};
        for (int i = 0; i < car.length; i++) {
            car[i].print();
        }
    }
}