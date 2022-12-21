package Model;

public class Student extends Human {
    private double mark;
    private int course;
    private String studentID;

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(mark + ":" + "Mark");
        System.out.println(course + ":" + "Course");
        System.out.println(studentID + ":" + "Student ID");
        System.out.println("***************************");
    }
}


