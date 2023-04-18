package LAB13.Facade.end;

// Subsystem 2: Session
public class Session {
    private User user;

    public void start(User user) {
        // start a new session for the user
        this.user = user;
    }

    public void end() {
        // end the current session
        user = null;
    }

    public boolean isValid() {
        // check if the current session is valid
        return user != null;
    }
}
