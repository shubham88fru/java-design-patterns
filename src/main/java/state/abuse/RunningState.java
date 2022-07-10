package state.abuse;

public class RunningState implements IState{
    private Stopwatch stopwatch;
    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }
    @Override
    public void click() {
        stopwatch.setCurrentState(new StoppedState(stopwatch));
        System.out.println("Stopped");
    }
}
