package interfaces.extend;

public interface A {
    // static interface methods should always have a body (since static methods can't be inherited)
    // call via interface name
    static void greeting() {
        System.out.println("I'm static method in interface");
    }

    default void fun() {
        System.out.println("In A");
    }

}
