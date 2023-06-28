package practiceOOP;

import java.nio.file.Path;
import java.util.List;

/** A class that represents a University */
public class University {
    // Instance variables
    private String name; // name of the university (like University of San Francisco)
    private List<Student> students; // list of students at this university
    // Feel free to add another data structure, for instance a HashMap that maps names to students

    /**
     * Constructor for class University.
     * Takes the name of university as a parameter
     * @param name name of university
     */
    public University(String name) {
        // FILL IN CODE: initialize instance variable name


        // FILL IN CODE: Create an ArrayList and assign a reference
        // to it to instance variable students



    }

    /**
     * Create a student with this name and id and
     * add the student to the list of students
     * @param studentName name of the student
     * @param studentId id of the student
     */
    public void addStudent(String studentName, int studentId) {
        // FILL IN CODE:
        // Create a student with this name and id

        // Add this student to the ArrayList of students

    }

    /** Return true if a person with the given name is a student at this university,
     * and false otherwise.
     * For the purpose of this exercise we assume that names are unique.
     * @param name name of the person
     * @return true if this person is a student at this university
     */
    public boolean findStudent(String name) {
        // FILL IN CODE: check if the student with this name is in the ArrayList


        return true;
    }

    /**
     * Return a string representation of the university
     * @return a string that contains the name of the university on the first line, and
     * then includes students (one per line): name, id on each line
     */
    public String toString() {
        // FILL IN CODE: return a string representation of the university - see description above


        return null; // remember to change
    }

    /**
     * Sorts this.students in increasing order either by name of by the id, depending on the argument
     * @param sortByName a boolean. If true, the method would sort students by name,
     *                   otherwise by id.
     */
    public void sort(boolean sortByName) {
        // FILL IN CODE: sort students.
        // You may use Collections.sort method.


    }

    /** Load information about students from the csv file.
     *  Each line of the file contains the name of the student and the id, separated by comma
     *
     * @param filePath Path to the input file
     */
    public void loadStudentDataFromFile(Path filePath) {
    // FILL IN CODE: read from the file, create student objects and add them to the list of students


    }
}
