import DBEntities.Patient;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// A class to test the Patient class Contactable implementation
public class TestPatient {
    Patient pat;
    String name="Martin Holloway";
    String ward="London";

    @BeforeEach
    public void setUp(){
        pat=new Patient(name,ward);
    }
    @Test
    public void testWhereAmI(){
        String loc=pat.whereAmI();
        assertEquals(name+" is in Ward "+ward,loc);
    }
    @Test public void testContact(){
        String msg=new String("Test Message");
        pat.setBedPhoneNum("12345678");

        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        PrintStream tempStore;

        // Store current output stream
        tempStore=System.out;
        // Capture and Replace System.out with my own output stream
        System.setOut(new PrintStream(baos));
        pat.contact(msg);
        // Restore System.out
        System.setOut(tempStore);
        // Check that the correct message is sent to this patient
        assertEquals("Calling Patient "+name+" on 12345678 Message:"+msg,baos.toString().trim());


    }
}
