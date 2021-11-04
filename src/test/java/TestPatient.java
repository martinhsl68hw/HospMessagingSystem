import DBEntities.Patient;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestPatient {
    Patient pat;
    String name=new String("Martin Holloway");

    @BeforeEach
    public void setUp(){
        pat=new Patient(name);
    }
    @Test
    public void testWhereAmI(){
        String loc=pat.whereAmI();
        assertEquals(name+" is in Ward 15",loc);
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

        assertEquals("Calling Patient "+name+" on 12345678 Message:"+msg,baos.toString().trim());


    }
}
