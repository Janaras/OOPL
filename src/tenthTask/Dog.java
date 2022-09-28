package tenthTask;

import static java.lang.Character.getName;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeaSound() {
        System.out.println(getName() + " " + "makes the sound gof-gof");

    }

    @Override
    public void jump() {
        System.out.println(getName() + " " + "can't jump");
    }

    @Override
    public void run() {
        System.out.println(getName() + " " + "runs faster then puppy ");
    }

    @Override
    public void bite() {
        System.out.println(getName() + " " + "bites harder then a puppy");

    }
}


