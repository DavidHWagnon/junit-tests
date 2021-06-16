import java.util.ArrayList;

public class Student {
<<<<<<< HEAD
=======

>>>>>>> 0f02e99b35dc098ec9732a8207820f163c17de0d
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

<<<<<<< HEAD
    // returns the student's id
    public long getId(){
        return id;}

    // returns the student's name
    public String getName(){
        return name;}

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

//     returns the average of the students grades
    public double getGradeAverage(){
        double acc = 0;
        for(int grade:grades){
            acc += grade;
        }
        return acc / this.grades.size() ;
=======
    public long getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / getGrades().size();
>>>>>>> 0f02e99b35dc098ec9732a8207820f163c17de0d
    }
}
