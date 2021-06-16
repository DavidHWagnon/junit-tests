import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student stud;

    @Before
    public void setUp(){
        this.stud = new Student(1, "Stud Manly");
    }

    @Test
    public void testStudentConstructor(){
        Student stud = new Student(1, "Stud Manly");

        assertEquals(1, stud.getId());
        assertEquals("Stud Manly", stud.getName());
        assertTrue(stud.getGrades().isEmpty());
    }

    @Test
    public void testGetId(){
        assertEquals(1, stud.getId());
        Student craig = new Student(27, "Craig Gregson");
        assertEquals(27, craig.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("Stud Manly", stud.getName());
        Student jenn = new Student(33, "Jenn Ann Hologram");
        assertEquals("Jenn Ann Hologram", jenn.getName());
    }

    @Test
    public void testAddGrade(){
        stud.addGrade(78);
        stud.addGrade(84);
        stud.addGrade(99);
        assertEquals(3, stud.getGrades().size());
        stud.addGrade(88);
        assertEquals(4, stud.getGrades().size());
        Student jenn = new Student(33, "Jenn Ann Hologram");
        jenn.addGrade(100);
        assertEquals(1, jenn.getGrades().size());
    }

    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }
}
