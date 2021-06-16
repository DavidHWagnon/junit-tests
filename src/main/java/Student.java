import java.util.ArrayList;

public class Student {

     long id;
     String name;
     ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

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
    public double getGradeAverage() {
        double acc = 0;
        for (int grade : grades) {
            acc += grade;
        }
        return acc / this.grades.size();
    }
}
