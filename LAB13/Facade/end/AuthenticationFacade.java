package LAB13.Facade.end;

// Facade: AuthenticationFacade
public class AuthenticationFacade {
    private AuthenticationService authenticationService;
    private Session session;

    public AuthenticationFacade() {
        this.authenticationService = new AuthenticationService();
        this.session = new Session();
    }

    public User signUp(String username, String password) {
        return authenticationService.signUp(username, password);
    }

    public User login(String username, String password) {
        User user = authenticationService.login(username, password);
        if (user != null) {
            session.start(user);
        }
        return user;
    }

    public void logout() {
        session.end();
    }

    public boolean isLoggedIn() {
        return session.isValid();
    }

    public void resetPassword(String username, String oldPassword, String newPassword) {
        User user = new User(username, oldPassword);
        if (user.verifyCredentials()) {
            authenticationService.resetPassword(user, newPassword);
        }
    }
}
