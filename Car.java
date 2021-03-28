enum Type {
    Petrol, Electric
}
public class Car {
    
    static int wheels = 4;
    public static int engine = 1;

    void checkType(Type type, int gas) {
        if (type == Type.Petrol ) {
            gasStatus(gas);
        } else {
            energyCheck(gas);
        }
    }

    void gasStatus(int gas) {
        if (gas < 50) {
            fillTank(gas);
        } else {
            gasEquipped();
        }
    }
    void energyCheck(int gas) {
        if (gas < 20) {
            chargeBattery(gas);
        } else {
            energyEquipped();
        }
    }
    static int fillTank(int gas) {
        return gas = 2000;

    }
    static int chargeBattery(int gas) {
        return gas = 100;

    }
    String energyEquipped() {
            return ("There still energy left");
    }
    String gasEquipped() {
        return ("There still gas left");
    }

}