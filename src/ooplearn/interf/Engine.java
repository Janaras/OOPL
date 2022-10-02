package ooplearn.interf;

public class Engine implements Airplane{
    @Override
    public void fly() {
        System.out.println("with the help of the engine, it sucks in air, compresses it and directs it to the combustion chamber");
    }


}
