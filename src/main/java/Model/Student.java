package Model;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Return the name and email of this student
    public String getStudent(){
        return this.name+", " +this.email;
    }

}
