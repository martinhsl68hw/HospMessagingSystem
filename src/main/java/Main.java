public class Main {
    // Entry point
    public static void main(String[] args) {
        HospContactDB hdb=new HospContactDB();
        try {
            hdb.addDoctor("Martin Holloway", "78668898");
            hdb.addDoctor("Jeff Lynne", "9798");
            hdb.addPatient("Bill Sykes", "56789734", "London");
            hdb.addUltrasoundScanner("ADBB5678", "Birmingham");

            hdb.messageAll("Emergency - clear the hospital");
            System.out.println(hdb.locateAll());
        }
        catch (Exception e){
            // If any of the above causes an exception, display it
            System.out.println(e.getMessage());
        }


    }
}
