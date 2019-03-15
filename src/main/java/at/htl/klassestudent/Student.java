package at.htl.klassestudent;

public class Student implements Comparable<Student> {

    private String vorname;
    private String nachname;

    public Student() {
        Student[] students = {
                new Student("Meris", "Besic"),
                new Student("Nina", "Weissengruber"),
                new Student("Magdalena", "Scholz"),
                new Student("Florian", "Klausner")
        };
    }

    public Student(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int compareTo(Student o) {
        if (this.nachname.equals(o.getNachname())) {
            return this.vorname.compareTo(o.getVorname());
        }
        return this.nachname.compareTo(o.getNachname());
    }
}
