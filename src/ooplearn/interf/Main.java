package ooplearn.interf;

public class Main {
        public static void main(String[]args){
            Airplane[] airplane = {
                    new Wing(),
                    new Engine(),
                    new Chassis()
            };
            for (Airplane a:airplane) {
                System.out.println(a);
                a.fly();
                a.setaRoute();
            }
        }
    }




