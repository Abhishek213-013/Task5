//task-5
interface Switchable {
    void turnOn();

    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: turned off");
    }
}

class LightSwitch {
    private Switchable device;
    private boolean on;

    public LightSwitch(Switchable device) {
        this.device = device;
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void toggle() {
        if (on) {
            device.turnOff();
            on = false;
        } else {
            device.turnOn();
            on = true;
        }
    }
}
