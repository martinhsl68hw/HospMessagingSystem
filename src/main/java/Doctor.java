public class Doctor extends Person {

    public Doctor(String name){
        super(name);
    }

    public String getPagerNum() {
        return contactNum;
    }

    public void setPagerNum(String pagerNum) {
        // Code to check pagerNum is a number only
        contactNum=pagerNum;
    }

    public void contact(String msg){
        // Calls the pager API
        System.out.println("Paging Dr "+name+" on "+contactNum+" Message:"+msg);
    }
}
