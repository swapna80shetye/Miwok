package StudentReportCardApp;

public class ReportCard {
    private String studentName;
    private int studentID;

    private Double mathsGrade;
    private String engGrade;
    private char musicGrade;

    public ReportCard(String inputName, int ID, String eng, double maths, char music) {
        studentName = inputName;
        studentID = ID;
        mathsGrade = maths;
        musicGrade = music;
        engGrade = eng;

    }

    public char getMusicGrade() {
        return musicGrade;
    }

    public Double getMathsGrade() {
        return mathsGrade;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getEngGrade() {
        return engGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setEngGrade(String engGrade) {
        this.engGrade = engGrade;
    }

    public void setMathsGrade(Double mathsGrade) {
        this.mathsGrade = mathsGrade;
    }

    public void setMusicGrade(char musicGrade) {
        this.musicGrade = musicGrade;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    @Override
    public String toString() {
        return studentName + "\n" + studentID + "\n" + mathsGrade + "\n" + engGrade + "\n" + musicGrade;
    }

    public static void main(String[] args) {
ReportCard s1=new ReportCard("swapna",39,"A+",78.93,'B');
System.out.println(s1);
    }
}