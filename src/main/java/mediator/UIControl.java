package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private final List<IEventHandler> eventHandlers = new ArrayList<>();
    public void addEventHandler(IEventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (IEventHandler eventHandler: eventHandlers) {
            eventHandler.handle();
        }
    }
}
