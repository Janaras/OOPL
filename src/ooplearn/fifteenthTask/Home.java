package ooplearn.fifteenthTask;

public abstract class Home {
    private String adress;

    public Home(String adress){
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void closeWithaKey(){}
}
