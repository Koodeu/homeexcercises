package kl.zadanie16;

public class RunnerApp {
    public static void main(String[] args) {


        getFitnessLevel(250);

    }

    public static Runner getFitnessLevel(double time) {

        if (time >= 250 && time <= 500) {
            Runner runner = Runner.BEGINNER;
            System.out.println("Fitness level: "+ runner.name());
            return runner;
        } else if (time >= 180 && time < 250) {
            Runner runner = Runner.INTERMEDIATE;
            System.out.println("Fitness level: "+ runner.name());
            return runner;

        } else if (time >= 150 && time < 180) {
            Runner runner = Runner.ADVANCED;
            System.out.println("Fitness level: "+ runner.name());
            return runner;
        }
        return null;
    }
}
