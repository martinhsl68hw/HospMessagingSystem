package DBEntities;

import DBEntities.Interfaces.Contactable;
import DBEntities.Interfaces.Locatable;




public class UltrasoundScanner extends Scanner implements Contactable, Locatable {
    public UltrasoundScanner(String IDnum){
        super(IDnum);
    }

    @Override
    public void contact(String msg) {
        System.out.println("Contacted DBEntities.UltrasoundScanner ID:"+IDnum+" "+msg);
    }

    @Override
    public String whereAmI() {
        return "US Scanner "+IDnum+" is in ward 5";
    }
}
