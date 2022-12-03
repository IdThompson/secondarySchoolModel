package models;
//import management.principal;
public class Applicant extends Person {
    private boolean isAdmitted = false;

    public Applicant(String name, int age, String address) {
        super(name, age, address);

    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }
}

