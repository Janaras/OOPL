package ooplearn.zeydel;

public class School {


    private int numOfSchool;
    private String name;

    public School(int numOfSchool,String name){
        this.numOfSchool = numOfSchool;
        this.name = name;
    }

    public int getNumOfSchool() {
        return numOfSchool;
    }

    public void setNumOfSchool(int numOfSchool) {
        this.numOfSchool = numOfSchool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

