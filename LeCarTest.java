import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class Carish extends LeCar {

    protected Carish() {
        super(2, Color.red, 240, "ZeCar");
    }

    @Override
    protected double speedFactor(){
        return 28;
    }
}

class LeCarTest {

    // Creates instance of LeCar.java //
    public LeCar lecar;

    @BeforeEach
    protected void ZeCarMaker() {
        lecar = new Carish();
    }

    @Test
    public void move() {
         /// SKA ÄNDRAS HEHEHEHEHE
        LeCar.direction = 1;
        LeCar.currentSpeed = 0.5;
        lecar.move();
        double oldPos = LeCar.currentXPosition;
        lecar.move();
        assertEquals(LeCar.currentXPosition, LeCar.currentSpeed + oldPos);

        LeCar.direction = -1;
        LeCar.currentSpeed = 0.5;
        lecar.move();
        oldPos = LeCar.currentXPosition;
        lecar.move();
        assertEquals(LeCar.currentXPosition, LeCar.currentSpeed - oldPos);

        LeCar.direction = 2;
        LeCar.currentSpeed = 0.5;
        lecar.move();
        oldPos = LeCar.currentYPosition;
        lecar.move();
        assertEquals(LeCar.currentYPosition, LeCar.currentSpeed + oldPos);

        LeCar.direction = 0;
        LeCar.currentSpeed = 0.5;
        lecar.move();
        oldPos = LeCar.currentYPosition;
        lecar.move();

    }

    @Test
    public void turnLeft() {
        LeCar.direction = 0;
        lecar.turnLeft();
        assertEquals(-1, LeCar.direction);
        lecar.turnLeft();
        assertEquals(2, LeCar.direction);
        lecar.turnLeft();
        assertEquals(1, LeCar.direction);
        lecar.turnLeft();
        assertEquals(0, LeCar.direction);
    }

    @Test
    public void turnRight() {
        LeCar.direction = 0;
        lecar.turnRight();
        assertEquals(1, LeCar.direction);
        lecar.turnRight();
        assertEquals(2, LeCar.direction);
        lecar.turnRight();
        assertEquals(-1, LeCar.direction);
        lecar.turnRight();
        assertEquals(0, LeCar.direction);
    }
}
