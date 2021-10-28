package DBEntities;

import DBEntities.Interfaces.Locatable;

public class Patient extends Person implements Locatable {
    public Patient(String name){
        super(name);
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
        System.out.println("Calling DBEntities.Patient "+name+" on "+contactNum+" Message:"+msg);
    }


    @Override
    public String whereAmI() {
        return name+" is in Ward 15";
    }
}
