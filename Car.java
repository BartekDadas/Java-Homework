enum Type {
    Petrol, Electric
}
public class Car {
    void Constructor() {
        int gas;
        Type type;
    }
    static int wheels = 4;
    public static int engine = 1;

    public static void checkAndTank(Type type, Integer gus) {
        if (type == Type.Petrol) {
            System.out.println("Car type: petrol ");
            gasStatus(gus);

        } else {
            System.out.println("Car type: electrical");
        }
    }


    public static void gasStatus(Integer gus) {
        if (gus > 15) {
            System.out.println("There still some gas left");
        } else {
            fillTank();
        }
    }

    public static void fillTank() {
        System.out.println("fill tank");
    }


    static class RaceCar extends Car {
        public static int engine = 2;
        static int spoiler = 1;
    }

    static class SUV extends Car {
        static int biggerTrunk = 1;
    }

    static class Compact extends Car {
        static int parkingCamera = 1;

    }
}