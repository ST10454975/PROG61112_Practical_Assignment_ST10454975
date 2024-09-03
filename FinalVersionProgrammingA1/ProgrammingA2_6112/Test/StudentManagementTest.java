

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
public class StudentManagementTest {

    public StudentManagementTest() {
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
     * Test of saveStudent method, of class StudentManagement.
     */
    @Test
    //test save student method
    public void testSaveStudent() {
        System.out.println("saveStudent");
        Student student = new Student("10111","james",19,"jamesW@gmail.com","IT");;
        StudentManagement instance = new StudentManagement();
        instance.saveStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of searchStudent method, of class StudentManagement.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        String id = "10111";
        StudentManagement instance = new StudentManagement();
        Student student = new Student("10111","james",19,"jamesW@gmail.com","IT");
        String expResult = student.getId() ;
        Student result = instance.searchStudent(id);
        assertEquals(10111, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class StudentManagement.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        String id = "10111";
        StudentManagement instance = new StudentManagement();
        boolean expResult = false;
        boolean result = instance.deleteStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of printStudentDetails method, of class StudentManagement.
     */
    @Test
    public void testPrintStudentDetails() {
        System.out.println("printStudentDetails");
        StudentManagement instance = new StudentManagement();
        instance.printStudentDetails();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of exitStudentApplication method, of class StudentManagement.
     */
    @Test
    public void testExitStudentApplication() {
        System.out.println("exitStudentApplication");
        StudentManagement instance = new StudentManagement();
        instance.exitStudentApplication();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
