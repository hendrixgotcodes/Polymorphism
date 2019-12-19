public class Car
{

    private String name;
    private boolean engine;
    private int cylinder;
    private int acceleration;
    int wheels;

    public String getName() {
        return name;
    }

    public int getAcceleration() {
        return acceleration;
    }

    private String engineType;
    private int speed;

    public Car( String name, int cylinder, int acceleration, String engineType ) {
        this.name = name;
        this.engine = true;
        this.cylinder = cylinder;
        this.acceleration = acceleration;
        this.engineType = engineType;
        this.wheels = 4;
    }
    public void startEngine()
    {
        System.out.println( "engine started.");
    }
    public void accelerate ()
    {
        System.out.println(name + " has accelerated with a speed of "+acceleration + "m/s");
    }
    public void brake()
    {
        System.out.println("Stopped.\nSpeed is now 0 m/s");
    }

}
class aventador extends Car
{
    private boolean superCharger = false;
    public aventador( int cylinder, int acceleration, String engineType,boolean superCharger) {
        super("Aventador", cylinder, acceleration, engineType);
        this.superCharger = superCharger;
        System.out.println("\nAventador");
    }

    @Override
    public void accelerate() {
        if (superCharger)
        {
            int chargedAcc = super.getAcceleration() * 1/13;
            chargedAcc += getAcceleration();

            System.out.println(super.getName() + " has accelerated with a speed of " + chargedAcc + "m/s");
        }
        else
        {
            super.accelerate();
        }
    }
}
class main
{

    public static void main(String[] args)
    {
        Car car = new Car("Car",4,60,"v8");
        car.startEngine();
        car.accelerate();
        car.brake();

        aventador S = new aventador(2,62,"V12",false);
        S.startEngine();
        S.accelerate();
        S.brake();

        aventador SVJ = new aventador(3,62,"V12",true);
        SVJ.startEngine();
        SVJ.accelerate();
        SVJ.brake();
    }

}

