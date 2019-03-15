package at.htl.klassestudent;

public class Klasse{

    int klassenbezeichnung;
    Student[] students;

    public int getKlassenbezeichnung(){
        return klassenbezeichnung;
    }

    public Student[] getStudents() {
        return students;
    }

    Klasse(int klassenbezeichnung, Student[] students){
        this.klassenbezeichnung = klassenbezeichnung;
        this.students = students;
    }

    public void sortBubble(){
        for (int i = students.length; i > 1; i--) {
            for (int j = 0; j < students.length-1; j++) {
                if(students[j].compareTo(students[j + 1]) > 0){
                    swap(j, j+1);
                }
            }
        }
    }
    public Student[] sortInsertion(){
        Student[] help = new Student[students.length];
        for (int i = 0; i < students.length; i++) {

            int j = i-1;

            while (j >= 0 && help[j].compareTo(students[i]) > 0) {
                help[j+1] = help[j];
                j--;
            }
            help[j+1] = students[i];
        }
        students = help;
        return students;
    }
    private void swap(int i, int j){
        Student help;
        help = students[i];
        students[i] = students[j];
        students[j] = help;
    }

}
