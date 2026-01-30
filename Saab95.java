import java.awt.*;

public class Saab95 extends LeCar {

    protected boolean turboOn;

    // Constructor below //
    protected Saab95(){
        super(2,Color.red, 125,"Saab95");
        turboOn = false;
        stopEngine();
    }

    protected void setTurboOn(){ // unik
	    turboOn = true;
    }

    protected void setTurboOff(){ // unik
	    turboOn = false;
    }

    //
    @Override
    protected double speedFactor(){ // unik
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

/*    protected void incrementSpeed(double amount){
        if ( getEnginePower() > (getCurrentSpeed() + speedFactor() * amount)){
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        } else {
            currentSpeed = getEnginePower();
        }
    }

    protected void decrementSpeed(double amount){
        if ( 0 < (getCurrentSpeed() + speedFactor() * amount)){
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        } else {
            currentSpeed = 0;
        }
    }

    // TODO fix this method according to lab pm
    protected void gas(double amount){
        if (amount <= 1 && amount >= 0 ){
            incrementSpeed(amount);
        }
    }

    // TODO fix this method according to lab pm
    protected void brake(double amount){
        if (amount <= 1 && amount >= 0 ){
            decrementSpeed(amount);
        }
    }*/
}
