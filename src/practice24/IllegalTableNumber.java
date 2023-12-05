package practice24;

import java.io.Serializable;
public class IllegalTableNumber extends RuntimeException implements Serializable {
    public IllegalTableNumber() {
        super("Invalid table number.");
    }
}
