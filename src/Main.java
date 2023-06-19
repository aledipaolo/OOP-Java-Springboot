public class Main {
    public static void main(String[] args) {
        Student mario = new Student("Mario");
        Student luigi = new Student("Luigi");

        mario.addGrade(30);
        mario.addGrade(18);
        mario.addGrade(27);
        mario.addGrade(29);

        luigi.addGrade(26);
        luigi.addGrade(28);
        luigi.addGrade(29);
        luigi.addGrade(29);
        luigi.addGrade(30);

        // confronto medie
        float mean1 = mario.GetAverageGrade();
        float mean2 = luigi.GetAverageGrade();

        if (mean1 > mean2) {
            System.out.println("Mario ha la media più alta: " + mean1);
        } else System.out.println("Luigi ha la media più alta: " + mean2);
    }
}