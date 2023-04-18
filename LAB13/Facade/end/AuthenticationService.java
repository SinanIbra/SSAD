package LAB13.Facade.end;

// Subsystem 3: AuthenticationService
public class AuthenticationService {
    public User signUp(String username, String password) {
        // create a new user and add it to the database or external authentication service
        return new User(username, password);
    }

    public User login(String username, String password) {
        // verify user credentials and start a new session for the user
        User user = new User(username, password);
        if (user.verifyCredentials()) {
            Session session = new Session();
            session.start(user);
            return user;
        } else {
            return null;
        }
    }

    public void resetPassword(User user, String newPassword) {
        // reset the user's password in the database or external authentication service
        user.setPassword(newPassword);
    }
}
