import DBEntities.*;
import DBEntities.Interfaces.Contactable;
import DBEntities.Interfaces.Locatable;

import java.util.ArrayList;

// This class implements a database of all hospital resources for purposes of location and contact
// These are currently:-
// Patients who can be located and contacted
// Doctors who can be contacted
// Ultrasound scanner that can be located and contacted

public class HospContactDB {
    // A list of all contactable resources in the DB
    ArrayList<Contactable> contactList=new ArrayList<>();
    // A list of all locatable resources in the DB
    ArrayList<Locatable> locList=new ArrayList<>();

    // Add a doctor to the database
    public void addDoctor(String name, String pagerNum){
        Doctor doc=new Doctor(name);
        doc.setPagerNum(pagerNum);
        contactList.add(doc);
    }
    // Add a patient to the database
    public void addPatient(String name, String bedPhoneNum, String ward){
        Patient pat=new Patient(name, ward);
        pat.setBedPhoneNum(bedPhoneNum);
        contactList.add(pat);
        locList.add(pat);
    }
    // Add a scanner to the database
    public void addUltrasoundScanner(String IDnum, String ward){
        UltrasoundScanner scanner=new UltrasoundScanner(IDnum, ward);
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
        String ret=null;
        for(Locatable l:locList){
            ret+=l.whereAmI()+"\n";
        }
        return ret;
    }
}
