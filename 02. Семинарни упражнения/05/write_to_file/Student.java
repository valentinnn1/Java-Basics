package sem_exercises.ex_5.write_to_file;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
