package pattern.chainofresponsibilitydesignpatternjava.behavioral;

import pattern.chainofresponsibilitydesignpatternjava.infra.database.Database;

public class RoleCheckHandler extends BaseHandle {

    private Database database;

    public RoleCheckHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            return true;
        }
        return handleNext(username, password);
    }
}
