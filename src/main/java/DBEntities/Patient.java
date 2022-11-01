package DBEntities;

import DBEntities.Interfaces.Locatable;

// This class represents a Patient. Patients must be locatable and contatable
public class Patient extends Person implements Locatable {
    private String ward;
    public Patient(String name, String ward){
        super(name);
        this.ward=ward;
    }

    public String getBedPhoneNum() {
        return contactNum;
    }

    public void setBedPhoneNum(String bedPhoneNum) {
        // Remove any possible non-numbers in the bed phone number
        contactNum = bedPhoneNum.replaceAll("[^\\d]", "");
    }
    public void contact(String msg){
        // Calls the bedphone API
        System.out.println("Calling Patient "+name+" on "+contactNum+" Message:"+msg);
    }
    @Override
    public String whereAmI() {
        // Returns name of the Patient plus their ward
        return name+" is in Ward "+ward;
    }

}
