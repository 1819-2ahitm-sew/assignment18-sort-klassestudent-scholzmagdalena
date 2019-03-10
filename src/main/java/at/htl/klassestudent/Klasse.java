package at.htl.klassestudent;

public class Klasse extends Student {

    public static void main(String[] args) {
        
        int klassenbezeignung;
        Student[] students = new Student[7];
        Student[] studentssortiert1;
        Student[] studentssortiert2;

        studentssortiert1 = sortBubble(students);
        studentssortiert2 = sortInsertion(students);

        for (int i = 0; i < studentssortiert1.length; i++) {
            System.out.println(studentssortiert1[i] + ", ");
        }
    }
    public static Student[] sortBubble(Student[] students){
        int iMin = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = i+1; j < students.length-1; j++) {
                if(students[j].compareTo(students[j]) > students[j+1].compareTo(students[j+1])){
                    iMin = j;
                }
            }
            swap(students, i, iMin);
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
    private static void swap(Student[] students, int i, int j){
        Student help;
        help = students[i];
        students[i] = students[j];
        students[j] = help;
    }
}
