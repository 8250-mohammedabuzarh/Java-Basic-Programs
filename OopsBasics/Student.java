package OopsBasics;

public class Student {
    Integer studentId;
    String name;
    Integer age;
    Integer grade;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentid=" + studentId +
                ", Name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
