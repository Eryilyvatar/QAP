package guru.qa.service;

import guru.qa.domain.User;
import guru.qa.exception.AuthenticateException;
import guru.qa.io.LoginView;

public class Application {

    private LoginView loginView;

    public void run() {
        try {
            User user = loginView.doLogin();
        } catch (AuthenticateException e) {
            throw new RuntimeException(e);
        }
    }
}
