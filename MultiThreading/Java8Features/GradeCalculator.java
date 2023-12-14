package MultiThreading.Java8Features;

@FunctionalInterface

public interface GradeCalculator {
    public abstract boolean isPass(int score);

    public static void main(String[] args) {
     GradeCalculator gradeCalculator=(score)->(score>=35);
        System.out.println("Are you pass : "+gradeCalculator.isPass(60));
        System.out.println("Are you pass : "+gradeCalculator.isPass(30));
    }
}
