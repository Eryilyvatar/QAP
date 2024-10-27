package guru.qa.data;

import guru.qa.domain.User;
import guru.qa.service.SecurityService;

import java.security.NoSuchAlgorithmException;
import java.util.Optional;

public class MockRepository implements UserRepository {
    @Override
    public Optional<User> findUserByUserName(String userName) {
        final String passwword = "12345";

        try {
            User user = new User("teslyukvv", 5001, new SecurityService().calculateHash(passwword));
            return Optional.of(user);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<User> findUserByIcqNumber(String userName) {
        return Optional.empty();
    }
}
