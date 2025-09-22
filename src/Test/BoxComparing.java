package Test;

import Box.Box;

public class BoxComparing {
    public static void main(String[] args) {
        Box current = new Box(10);
        Box other = current.increase();

        current.showVolume();
        other.showVolume();
    }
}
