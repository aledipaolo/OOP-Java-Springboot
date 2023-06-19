import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }


    public void addGrade(int grade) {
        grades.add(grade);

        System.out.println(grades);
    }

    public float GetAverageGrade() {
        //somma tutti i valori di una lista
        float sum = 0, mean = 0;
        for(Integer d : grades)
            sum += d;

        mean = sum / grades.size(); //media
        System.out.println(mean);

        return mean;
    }
}
