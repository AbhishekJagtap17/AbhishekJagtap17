package operatorAssignment;

public class Operator12 {
    public static void main(String[] args) {
        int total=90;
        int boys=45;
        int girls=total-boys;

        int studentScoredGradeA=(total*50)/100;
        int boysScoredGradeA=20;
        int girlsScoredGradeA=(studentScoredGradeA-boysScoredGradeA);
        System.out.println("Total no of girls getting grade A is :"+girlsScoredGradeA);
    }
}
