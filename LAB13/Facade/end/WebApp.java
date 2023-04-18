package LAB13.Facade.end;

// Client
public class WebApp {
    public static void main(String[] args) {
        AuthenticationFacade authenticationFacade = new AuthenticationFacade();

        User user1 = authenticationFacade.signUp("john_doe", "password123");
        User user2 = authenticationFacade.login("jane_doe", "password456");

        if (authenticationFacade.isLoggedIn()) {
            System.out.println("User " + user2.getUsername() + " is logged in.");
            authenticationFacade.logout();
        }

        authenticationFacade.resetPassword("john_doe", "password123", "newpassword789");
    }
}
