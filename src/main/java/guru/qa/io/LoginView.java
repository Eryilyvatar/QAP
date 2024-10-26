package guru.qa.io;

import guru.qa.domain.User;
import guru.qa.exception.AuthenticateException;

public interface LoginView {
    User doLogin() throws AuthenticateException;
}
