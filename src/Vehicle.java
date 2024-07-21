public abstract class Vehicle implements ServiceInterface {
    protected final String modelName;
    protected final int wheelsCount;

    protected Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected String getModelName() {
        return modelName;
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
