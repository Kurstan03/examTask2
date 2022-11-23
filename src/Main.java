import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EducationCenter[] educationCenters = {
                new School("Bilimkana","KG", LocalDate.of(2000,2,23)),
                new College("Harvard","USA",LocalDate.of(1734,10,3)),
                new University("Columbia","USA",LocalDate.of(1678,2,7))
        };
        Student[] students = {
                new Student("Kurstan","Erkinbaev",Gender.MALE,LocalDate.of(2021,9,15),educationCenters[0]),
                new Student("ssssssss","sssssssss",Gender.FEMALE,LocalDate.of(2000,9,15),educationCenters[1]),
                new Student("wwwwwwwww","wwwwwwwwwww",Gender.MALE,LocalDate.of(1999,3,5),educationCenters[0]),
                new Student("gggggggggg","gggggggggg",Gender.FEMALE,LocalDate.of(2001,9,15),educationCenters[2]),
                new Student("zzzzzzzzz","zzzzzzzzzz",Gender.MALE,LocalDate.of(1921,4,27),educationCenters[2]),
                new Student("jjjjjjjj","jjjjjjjjjjj",Gender.MALE,LocalDate.of(1997,2,25),educationCenters[1]),
                new Student("aaaaaaaa","aaaa",Gender.MALE,LocalDate.of(2021,9,15),educationCenters[0]),
                new Student("iiiiiiii","iiiiiiii",Gender.FEMALE,LocalDate.of(2022,9,15),educationCenters[1]),
                new Student("mmmmmmmmm","mmmmmmmmm",Gender.MALE,LocalDate.of(2011,12,3),educationCenters[0]),
                new Student("ccccccccc","ccccccc",Gender.FEMALE,LocalDate.of(2003,6,15),educationCenters[2])
        };
        method(students);
        method1(educationCenters,students);
    }
    public static void method(Student[] students){
        for (Student student : students) {
            System.out.println(student.toString());
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
        }
    }

    public static void method1(EducationCenter[] educationCenters, Student[] students) {
        Student[] bilinkana = new Student[students.length];
        Student[] harvard = new Student[students.length];
        Student[] columbia = new Student[students.length];

        int index = 0;
        for (EducationCenter e : educationCenters) {
            for (Student s : students) {
                if (e.getName().toLowerCase().equals(s.getEducationCenter().getName().toLowerCase()))
                    bilinkana[index] = s;

            }
            for (Student s : students) {
                if (e.getName().toLowerCase().equals(s.getEducationCenter().getName().toLowerCase()))
                    harvard[index] = s;
            }
            for (Student s : students) {
                if (e.getName().toLowerCase().equals(s.getEducationCenter().getName().toLowerCase()))
                    columbia[index] = s;
            }
            index++;
        }
        System.out.println(Arrays.toString(bilinkana));
    }
}