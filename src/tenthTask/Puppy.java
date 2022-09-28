package tenthTask;

import static java.lang.Character.getName;

public class Puppy extends Animals {


    @Override
    public void makeaSound() {
        System.out.println(getName() + " " + "makes the sound gaf-gaf");
    }

    @Override
    public void jump() {
        System.out.println(getName() + " " + "jumps fast");
    }

    @Override
    public void run() {
        System.out.println(getName() + " " +  "runs fast");

    }

    @Override
    public void bite() {
        System.out.println(getName() + " " + "jumping and playing");

    }

    public Puppy(String name) {
        super(name);
    }
}


