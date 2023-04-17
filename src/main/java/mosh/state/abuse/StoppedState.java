package mosh.state.abuse;

public class StoppedState implements IState{
    private Stopwatch stopwatch;
public StoppedState(Stopwatch stopwatch) {
    this.stopwatch = stopwatch;
}
    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Running");
    }
}
