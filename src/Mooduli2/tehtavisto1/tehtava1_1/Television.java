package src.Mooduli2.tehtavisto1.tehtava1_1;

public class Television {
    int channel;
    boolean isTvOn = true;

    public Television(int initialChannel) {
        this.channel = initialChannel;
    }

    public boolean isOn() {
        return isTvOn = false;
    }

    public void setChannel(int channel) {
        if (this.channel == 10) {
            this.channel = 1;
        }
        else {
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public boolean pressOnOff() {
        if (!isTvOn) {
            return false;
        }
        return isTvOn;
    }
}
