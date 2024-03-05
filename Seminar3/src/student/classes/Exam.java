package student.classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exam {
    private Map<Integer, String> studentsWhoHaveTakenExam;

    public Exam() {
        this.studentsWhoHaveTakenExam = new HashMap<>();
    }

    public boolean takeExam(Student student) {
        if (studentsWhoHaveTakenExam.containsKey(student.getId())) {
            return false; // student has already taken the exam
        } else {
            studentsWhoHaveTakenExam.put(student.getId(), student.getName());
            return true; // student is allowed to take the exam
        }
    }
}
