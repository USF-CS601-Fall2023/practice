package practiceOOP;

/** A class that represents a student that has a name and an id */
public class Student implements Comparable<Student> { // compares students based on name
    // Instance variables:
    private String name; // student's name
    private int id; // student's id
    private double averageGPA; // student's average GPA

    /**
     * Constructor for class Student
     * @param name name of the student
     * @param id integer id of the student
     */
    public Student(String name, int id) {
        // FILL IN CODE: initialize instance variables name and id


    }

    /**
     * Return the name of the student
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the id of the student
     * @return id
     */
    public int getId() {
        return this.id;
    }

    // FILL IN CODE:
    // TODO: add setters for instance variables name and id

    /**
     * Return a string representation of the student
      * @return string that contains name and id, separated by comma
     */
    public String toString() {
        // FILL IN CODE: return a string that contains the name and the id,
        // separated by comma

        return null; // remember to change this
    }

    /**
     * Compares this student with the otherStudent by name, and if names are equal, by id.

     * @param otherStudent another student
     * @return a negative number if this.name comes before otherStudent's name in English alphabet,
     *         if names are the same, compare by id; if names and ids are the same, return a 0.
     *         a positive number if this.name comes after otherStudents's name
     */
    public int compareTo(Student otherStudent) {
        // FILL IN CODE to compare students by name
        // HINT: use String's compareTo method

        return 0; // remember to change this
    }
}
