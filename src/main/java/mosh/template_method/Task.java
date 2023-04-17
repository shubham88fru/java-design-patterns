package mosh.template_method;

public abstract class Task {
    private final AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    //A template that will
    //be exposed to all subclass
    //to perform execute
    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
