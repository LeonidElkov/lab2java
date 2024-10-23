import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int... grades) {
        this.name = name;
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    @Override public String toString() {
        return name + ": " + Arrays.toString(grades);
    }

    public double getAverage() {
        if (grades.length == 0) return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public boolean isExcellentStudent() {
        if (grades.length == 0) return false;
        for (int grade : grades) {
            if (grade != 5) {
                return false;
            }
        }
        return true;
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }
}
