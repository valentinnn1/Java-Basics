package lab_exercises.lab_10;

public class Ticket {
    private String message;
    private boolean isMarkedForWork;
    private boolean isResolved;

    public Ticket(String message) {
        this.message = message;
        this.isMarkedForWork = false;
        this.isResolved = false;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isMarkedForWork() {
        return isMarkedForWork;
    }

    public void setMarkedForWork(boolean markedForWork) {
        isMarkedForWork = markedForWork;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }
}
