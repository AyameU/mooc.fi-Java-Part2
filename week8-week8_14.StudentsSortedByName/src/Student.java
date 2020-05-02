public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student) {

        // if compared items are equal return 0, meaning they are equal according to String's CompareTo()
        if(this.name.compareToIgnoreCase(student.getName()) == 0) {
            return 0;
        }
        // if compared item is greater than the other item, return 1 meaning it's greater lexographically
        else if(this.name.compareToIgnoreCase(student.getName()) > 0) {
            return 1;
        }
        // everything else is lesser lexographically
        else {
            return -1;
        }
    }

}
