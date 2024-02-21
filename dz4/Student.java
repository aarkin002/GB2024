public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getStudentId() {
        return studentId;
    }


    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
