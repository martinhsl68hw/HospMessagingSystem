import java.util.ArrayList;

public class HospContactDB {
    // A list of all persons in the DB
    ArrayList<Person> personList=new ArrayList<Person>();
    // Add a doctor to the database
    public void addDoctor(String name, String pagerNum){
        Doctor doc=new Doctor(name);
        doc.setPagerNum(pagerNum);
        personList.add(doc);
    }
    // Add a patient to the database
    public void addPatient(String name, String bedPhoneNum){
        Patient pat=new Patient(name);
        pat.setBedPhoneNum(bedPhoneNum);
        personList.add(pat);
    }
    // Message all doctors and patients in the hospital
    public void messageAll(String msg){
        for(Person person:personList){
            person.contact(msg);
        }
    }
}
