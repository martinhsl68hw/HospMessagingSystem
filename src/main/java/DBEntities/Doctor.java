package DBEntities;

// A class representing a Doctor. Doctors are contactable but not locatable
public class Doctor extends Person {

    public Doctor(String name){
        super(name);
    }

    public String getPagerNum() {
        return contactNum;
    }

    public void setPagerNum(String pagerNum) throws NumberFormatException {
        // Code to check that pagerNum is a number only and is therefore valid, thus protecting the pager API
        // If it's invalid and not a number, this will throw an exception
        Integer.parseInt(pagerNum);
        contactNum=pagerNum;
    }

    public void contact(String msg){
        // Calls the pager API
        // This takes numbers only - absolutely no letters or chars. See setPagerNum above
        System.out.println("Paging Dr "+name+" on "+contactNum+" Message:"+msg);
    }
}
