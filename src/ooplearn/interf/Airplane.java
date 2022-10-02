package ooplearn.interf;

interface Airplane {
        default void fly() {
        System.out.println("Airplane can fly above 8000m");
    }

        default void setaRoute() {
        System.out.println("The plane lands on the ground");
    }
}
