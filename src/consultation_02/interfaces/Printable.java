package consultation_02.interfaces;

public interface Printable {
    // public static final
    int CONST = 1;
    int[] numbers = {1,2,3,4,5};
    //public abstract
    void print();

    // JDK 8
    default void printDefault() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }

}
