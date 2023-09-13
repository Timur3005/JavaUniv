package third.shells;

public class Shells {

    public static void main(String[] args) {
        Double d = Double.valueOf("123.4");
        System.out.println("№1: "+d);
        d = Double.parseDouble("132.6");
        System.out.println("№2: "+d);
        System.out.println("double "+d.doubleValue());
        System.out.println("byte " + d.byteValue());
        System.out.println("float " + d.floatValue());
        System.out.println("int " + d.intValue());
        System.out.println("long " + d.longValue());
        System.out.println("short " + d.shortValue());

        System.out.println("Double" + d);

        String s = Double.toString(d);
        System.out.println("String "+ s);
    }

}
