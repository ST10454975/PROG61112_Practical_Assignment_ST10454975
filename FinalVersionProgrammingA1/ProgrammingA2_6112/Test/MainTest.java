

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of displayMenu method, of class Main.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        Main.displayMenu();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of captureNewStudent method, of class Main.
     */
    @Test
    public void testCaptureNewStudent() {
        System.out.println("captureNewStudent");
        Main.captureNewStudent();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of searchForStudent method, of class Main.
     */
    @Test
    public void testSearchForStudent() {
        System.out.println("searchForStudent");
        Main.searchForStudent();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class Main.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Main.deleteStudent();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
