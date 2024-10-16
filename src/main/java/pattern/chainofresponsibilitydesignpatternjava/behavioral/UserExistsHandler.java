package pattern.chainofresponsibilitydesignpatternjava.behavioral;

import pattern.chainofresponsibilitydesignpatternjava.infra.database.Database;

public class UserExistsHandler extends BaseHandle {

    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            return false;
        }

        return handleNext(username, password);
    }
}
