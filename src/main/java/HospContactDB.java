import java.util.ArrayList;

public class HospContactDB {
    ArrayList<Person> personList=new ArrayList<Person>();

    public void addDoctor(String name, String num){
        Doctor doc=new Doctor(name);
        doc.setPagerNum(num);
        personList.add(doc);
    }
    public void addPatient(String name, String num){
        Patient pat=new Patient(name);
        pat.setBedPhoneNum(num);
        personList.add(pat);
    }

    public void messageAll(String msg){
        for(Person person:personList){
            person.contact(msg);
        }
    }
}
