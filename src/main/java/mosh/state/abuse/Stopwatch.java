package mosh.state.abuse;

public class Stopwatch {
    private IState currentState = new StoppedState(this);
    public void click() {
        currentState.click();
    }

    public IState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }
}
