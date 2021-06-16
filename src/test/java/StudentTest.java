<<<<<<< HEAD
import org.junit.Before;
=======
>>>>>>> 0f02e99b35dc098ec9732a8207820f163c17de0d
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
<<<<<<< HEAD
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
=======

    @Test
    public void testIfStudentCanBeCreated(){
        Student fer = new Student(1L, "fer");
        Student nullStudent = null;
        assertNotNull(fer);
        assertNull(nullStudent);
    }

    @Test
    public void testIfFieldsAreSet(){
        Student fer = new Student(1L, "fer");
        assertEquals(1L, fer.getId());
        assertEquals("fer", fer.getName());

        Student rosie = new Student(40L, "Rosie");
        assertEquals(40L, rosie.getId());
        assertEquals("Rosie", rosie.getName());
    }

    @Test
    public void testIfAddGradeWorks(){
        Student fer = new Student(1L, "fer");
        assertEquals(0, fer.getGrades().size());
        fer.addGrade(90);
        assertEquals(1, fer.getGrades().size());
        fer.addGrade(70);
        assertEquals(2, fer.getGrades().size());
    }

    @Test
    public void testIfGetGradesWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70);
        assertSame(90, fer.getGrades().get(0));
        assertSame(70, fer.getGrades().get(1));
    }

    @Test
    public void testIfGetAVGWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70); // 160 / 2 = 80
        assertEquals(80, fer.getGradeAverage(), 0);
        fer.addGrade(50); // 210 / 3 = 70
        assertEquals(70, fer.getGradeAverage(), 0);
    }

>>>>>>> 0f02e99b35dc098ec9732a8207820f163c17de0d
}
