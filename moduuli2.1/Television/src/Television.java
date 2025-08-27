public class Television {
    private int channel;
    private boolean isOn;

    public Television() {
        this.channel = 1;
        this.isOn = false;
    }

    public boolean isOn() {
        return false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > 10) {
            this.channel = 1;
        }
        else {
            this.channel = channel;
        }
    }

    public void pressOnOff() {
        isOn = !isOn;
    }
}

