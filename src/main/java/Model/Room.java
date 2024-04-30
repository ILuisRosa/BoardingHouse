package Model;

public class Room {
    private int identifier ;
    private boolean isOcupied ;
    private Student studentID ;
    
    public int getIdentifier() {
        return identifier;
    }

    public boolean isOcupied() {
        return isOcupied;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setOcupied(boolean ocupied) {
        isOcupied = ocupied;
    }

    public void setStudentID(Student studentID) {
        this.studentID = studentID;
    }

    public Student getStudentID() {
        return studentID;
    }
}
