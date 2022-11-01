package DBEntities;

import DBEntities.Interfaces.Contactable;
import DBEntities.Interfaces.Locatable;


// This class represents an Ultrasound scanner. It must be locatable and contactable

public class UltrasoundScanner extends Scanner implements Contactable, Locatable {
    private String ward;
    public UltrasoundScanner(String IDnum, String ward){
        super(IDnum);
        this.ward=ward;
    }

    @Override
    public void contact(String msg) {
        System.out.println("Contacted DBEntities.UltrasoundScanner ID:"+IDnum+" "+msg);
    }

    @Override
    public String whereAmI() {
        return "US Scanner "+IDnum+" is in ward "+ward;
    }
}
