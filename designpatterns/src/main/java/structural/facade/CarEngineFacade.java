package structural.facade;

public class CarEngineFacade {
    private FuelInjector fuelInjector;
    private AirFlowController airFlowController;
    private Starter starter;

    public CarEngineFacade(FuelInjector fuelInjector, AirFlowController airFlowController, Starter starter) {
        this.fuelInjector = fuelInjector;
        this.airFlowController = airFlowController;
        this.starter = starter;
    }

    public void startEngine() {
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.inject();
        starter.start();
    }

    public void stopEngine() {
        fuelInjector.off();
        airFlowController.off();
        starter.stop();
    }
}
