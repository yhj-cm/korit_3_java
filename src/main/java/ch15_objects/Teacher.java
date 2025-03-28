package ch15_objects;

public class Teacher {
    private String name;
    private String schoolname;

    public Teacher(String name, String schoolname) {
        this.name = name;
        this.schoolname = schoolname;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
