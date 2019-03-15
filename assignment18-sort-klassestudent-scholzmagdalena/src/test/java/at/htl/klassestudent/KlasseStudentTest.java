package at.htl.klassestudent;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class KlasseStudentTest {

    @BeforeAll
    static void setup(){

    }

    @Test
    public void sortA(){
        Student[] studentsA = {
                new Student("Meris", "Besic"),
                new Student("Nina", "Weissengruber"),
                new Student("Magdalena", "Scholz"),
                new Student("Florian", "Klausner")
        };
        Student[] expected = studentsA.clone();

        Klasse klasse = new Klasse(0, studentsA);
        klasse.sortBubble();
        Arrays.sort(expected);
        assertThat(klasse.getStudents(), is(expected));
    }

    @Test
    public void sortB(){
        Student[] studentsA = {
                new Student("Meris", "Besic"),
                new Student("Nina", "Weissengruber"),
                new Student("Magdalena", "Scholz"),
                new Student("Florian", "Klausner")
        };
        Student[] expected = studentsA.clone();

        Klasse klasse = new Klasse(0, studentsA);
        klasse.sortInsertion();
        Arrays.sort(expected);
        assertThat(klasse.getStudents(), is(expected));
    }

}