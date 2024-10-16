package pattern.chainofresponsibilitydesignpatternjava.behavioral;

public abstract class BaseHandle {

    private BaseHandle next;

    public BaseHandle setNextHandle(BaseHandle next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }
}
