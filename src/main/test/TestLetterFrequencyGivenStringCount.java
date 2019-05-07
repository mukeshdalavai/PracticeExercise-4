package test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.stackroute.pe4.*;
import org.junit.*;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;

public class TestLetterFrequencyGivenStringCount {

        LetterFrequency letterFrequency=new LetterFrequency();
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
        public void testLetterFrequency() {
            String inputString="This is stackroute";
            assertEquals(3,letterFrequency.frequencyFinder(inputString,"s"));
        }



}
