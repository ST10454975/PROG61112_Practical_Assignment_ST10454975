import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//format auto gen using net beans feature

/**
 *
 * @author lab_services_student
 */
public class StudentTest {

    public StudentTest() {
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
     * Test of getId method, of class Student.
     */
    @Test
    //testing if getID method
    public void testGetId() {
        System.out.println("getId");
        //creating a new student object called instance to be able to access and check the attributes
        Student instance = new Student("10111","james",19,"jamesW@gmail.com","IT");
        //chekcing if the expected result is equal to the value given in the instance object
        String expResult = "10111";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student ("10111","james",19,"jamesW@gmail.com","IT");
        String expResult = "james";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student("10111","james",19,"jamesW@gmail.com","IT");
        int expResult = 19;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Student.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Student instance = new Student("10111","james",19,"jamesW@gmail.com","IT");;
        String expResult = "jamesW@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Student instance = new Student("10111","james",19,"jamesW@gmail.com","IT");;
        String expResult = "IT";
        String result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("10111","james",19,"jamesW@gmail.com","IT");;
        String expResult =
                "Student ID: " + "10111" + "\n" +
                "Student Name: " + "james" + "\n" +
                "Student Age: " + "19" + "\n" +
                "Student Email: " + "jamesW@gmail.com" + "\n" +
                "Student Course: " + "IT" + "\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
