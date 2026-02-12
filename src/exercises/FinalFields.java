package exercises;

public class FinalFields {

    public final int intValue = 42;
    public final double doubleValue=42.0;
    public final FortyTwo objectValue = new FortyTwo();


    public static void main(String[] args) {

        FinalFields demo = new FinalFields();

        // This would result in a compiler error
        //demo.intValue = 6;

        // This is allowed since we haven't initialized doubleValue yet
        demo.doubleValue = 42.0;

        // However, this would result in a compiler error
        demo.doubleValue = 6.0;

        // This would result in a compiler error, since we're trying to
        // give objectValue a different object value
        demo.objectValue = new FortyTwo();

        // However, this is allowed since we're changing a field
        // inside the final object, and not changing which object
        // objectValue refers to
        demo.objectValue.intValue = 6;
    }
}