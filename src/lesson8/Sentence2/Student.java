package lesson8.Sentence2;

public class Student {
    private int studentCode;
    private String name;
    private String major;
    private float theoryScore;
    private float praticeScore;

    public Student(int studentCode, String name, String major, float theoryScore, float praticeScore) {
        this.studentCode = studentCode;
        this.name = name;
        this.major = major;
        this.theoryScore = theoryScore;
        this.praticeScore = praticeScore;
    }

    public Student() {
    }

    public double getStudentCode() {
        return studentCode;
    }

    public void setStudentCode( int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float getPraticeScore() {
        return praticeScore;
    }

    public void setPraticeScore(float praticeScore) {
        this.praticeScore = praticeScore;
    }
    public float calculateAverageScore(float dlt , float dth){
        dlt = theoryScore;
        dth = praticeScore;
        float dtb = (dlt+dth)/2;
        return dtb;
    }
    public String toString(){
        return studentCode  + name  + major + theoryScore + praticeScore  + calculateAverageScore(theoryScore,praticeScore);
    }
    public void inSV() {
        System.out.printf("%8d %9s %15s %6s %20s %10s  %2f %10s %2f %10s %2f \n", studentCode  ,"",  name ,"", major ,"",theoryScore , "" , praticeScore , "", calculateAverageScore(theoryScore,praticeScore));
    }
}
