
   public class Switch {
    private boolean isOn;

    public Switch(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public static void main(String[] args) {
        Switch lightSwitch = new Switch(false);

        System.out.println("Is the light on? " + lightSwitch.isOn());

        lightSwitch.turnOn();
        System.out.println("Is the light on? " + lightSwitch.isOn());

        lightSwitch.turnOff();
        System.out.println("Is the light on? " + lightSwitch.isOn());

        lightSwitch.toggle();
        System.out.println("Is the light on? " + lightSwitch.isOn());
    }
}


