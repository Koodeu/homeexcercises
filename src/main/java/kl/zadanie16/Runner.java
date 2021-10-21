package kl.zadanie16;

public enum Runner {

    BEGINNER(250, 500),
    INTERMEDIATE(180,249),
    ADVANCED(150, 179);


    private double minTime;
    private double maxTime;

    Runner(double minTime, double maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "minTime=" + minTime +
                ", maxTime=" + maxTime +
                '}';
    }
}
