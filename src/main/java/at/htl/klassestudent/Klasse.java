package at.htl.klassestudent;

public class Klasse extends Student {

    public static void main(String[] args) {
        
        int klassenbezeichnung;
        Student[] students = new Student[7];
        Student[] studentssortiert;

        studentssortiert = sortBubble(students);
        studentssortiert = sortInsertion(students);

        for (int i = 0; i < studentssortiert.length; i++) {
            System.out.println(studentssortiert[i] + ", ");
        }
    }
    public static Student[] sortBubble(Student[] students){
        int iMin = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = i; j < students.length-1; j++) {
                if(students[j].compareTo(students[j]) > students[j+1].compareTo(students[j+1])){
                    iMin = j;
                }
            }
            Student help;
            help = students[i];
            students[i] = students[iMin];
            students[iMin] = help;

            System.out.println(students[i] + " ");
        }
        return students;
    }
    public static Student[] sortInsertion(Student[] students){
        Student help;
        for (int i = 1; i < students.length; i++) {
            help = students[i];
            int j = 0;
            for (j = i; j > 0; j--) {
                if(help.compareTo(students[j-1]) < 0){
                    students[j] = students[j-1];
                }
            }
            students[j] = help;
        }
        return students;
    }
}
