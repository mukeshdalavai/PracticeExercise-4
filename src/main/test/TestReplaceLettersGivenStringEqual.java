package test;;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.stackroute.pe4.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TestReplaceLettersGivenStringEqual {

        ReplaceLetters replaceLetters=new ReplaceLetters();
        @Before
        public void setup() {
            /* EvenNumTest en=new EvenNumTest();*/
            // This methods runs, before running any one of the test case
            // This method is used to initialize the required variables

        }

        @After
        public void teardown() {
            // This method runs, after running all the test cases
            // This method is used to clear the initialized variables
            /* en=null;*/
        }

        @Test
        public void testreplaceString() {
            String inputString="daily dry";
            assertEquals("faity fry",replaceLetters.replaceString(inputString));
        }
}

