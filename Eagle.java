public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.setFlying(true);
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }

    }

    @Override
    public int ascend(int meters) {
        if (this.isFlying()) {
            this.setAltitude( //put an ascend limit
                (this.getAltitude() + meters ) > 300 ? 300 :this.getAltitude() + meters );
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.getAltitude());
        }
        return this.getAltitude();
    }

    @Override
    public void glide() {
        System.out.println("It glides into the air.");
    }

    @Override
    public int descend(int meters) {
        if (this.isFlying() && this.getAltitude() > 0) {
            this.setAltitude( //put a limitless to descend 
                    (this.getAltitude() - meters) > 0 ? (this.getAltitude() - meters) : 0);

            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.getAltitude());
        }
        return this.getAltitude();
    }

    @Override
    public void land() {
        if (this.isFlying() && this.getAltitude() <= 1) {
            this.setAltitude(0);
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't lands.%n", this.getName());
        }

    }
}
