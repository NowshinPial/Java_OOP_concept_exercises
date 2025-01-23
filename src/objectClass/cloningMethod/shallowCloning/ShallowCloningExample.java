package objectClass.cloningMethod.shallowCloning;

class Battery {
    int charge;

    Battery(int charge) {
        this.charge = charge;
    }
}

class Robot implements Cloneable { // Cloneable means "I want to make copies!"
    String name;  // Simple sticker (easy to copy)
    Battery battery; // Separate box (shared between robots)

    Robot(String name, Battery battery) {
        this.name = name;
        this.battery = battery;
    }

    // Shallow clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Let Java handle the basic copying
    }
}

public class ShallowCloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Original Robo with its battery
        Battery battery = new Battery(100); // Battery has 100% charge
        Robot originalRobot = new Robot("Robo", battery);

        // Clone the robot
        Robot clonedRobot = (Robot) originalRobot.clone();

        //modify the name
        clonedRobot.name = "Robot";

        // See the difference
        System.out.println("Original Robot Name: " + originalRobot.name);
        System.out.println("Cloned Robot Name: " + clonedRobot.name);

        // Modify the cloned robot's battery
        clonedRobot.battery.charge = 50;
        System.out.println("Original Robot Battery Charge: " + originalRobot.battery.charge);
        System.out.println("Cloned Robot Battery Charge: " + clonedRobot.battery.charge);
    }
}
