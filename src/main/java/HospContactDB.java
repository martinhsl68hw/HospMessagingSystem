import DBEntities.*;
import DBEntities.Interfaces.Contactable;
import DBEntities.Interfaces.Locatable;

import java.util.ArrayList;

public class HospContactDB {
    // A list of all persons in the DB
    ArrayList<Contactable> contactList=new ArrayList<>();
    ArrayList<Locatable> locList=new ArrayList<>();

    // Add a doctor to the database
    public void addDoctor(String name, String pagerNum){
        Doctor doc=new Doctor(name);
        doc.setPagerNum(pagerNum);
        contactList.add(doc);
    }
    // Add a patient to the database
    public void addPatient(String name, String bedPhoneNum){
        Patient pat=new Patient(name);
        pat.setBedPhoneNum(bedPhoneNum);
        contactList.add(pat);
        locList.add(pat);
    }
    // Add a scanner to the database
    public void addUltrasoundScanner(String IDnum){
        UltrasoundScanner scanner=new UltrasoundScanner(IDnum);
        contactList.add(scanner);
        locList.add(scanner);
    }
    // Message all doctors and patients in the hospital
    public void messageAll(String msg){
        for(Contactable c:contactList){
            c.contact(msg);
        }
    }
    // Locate all US scanners and Patients
    public String locateAll(){
        String ret = new String();
        for(Locatable l:locList){
            ret+=l.whereAmI()+"\n";
        }
        return ret;
    }
}
