public class Bicycle extends Vehicle implements ServiceInterface {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
    }
}
