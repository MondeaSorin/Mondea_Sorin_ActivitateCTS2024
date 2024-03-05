package student.classes;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Student {
    private String name;
    private final Integer id;
    private static Set<Integer> ids = new HashSet<>();

    public Student(String name) {
        this.name = name;
        this.id = generateUniqueId();
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    private Integer generateUniqueId() {
        Integer id = new Random().nextInt(10000);
        while (ids.contains(id)) {
            id = new Random().nextInt(10000);
        }
        ids.add(id);
        return id;
    }
}
