public class Main {
    public static void main(String[] args) {
        HospContactDB hdb=new HospContactDB();
        hdb.addDoctor("Martin Holloway","78668898");
        hdb.addDoctor("Jeff Lynne","9798");
        hdb.addPatient("Bill Murray", "567werwe89734");

        hdb.messageAll("Emergency - clear the hospital");

    }
}
