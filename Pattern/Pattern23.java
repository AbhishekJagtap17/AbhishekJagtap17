package Pattern;

public class Pattern23 {
    public static void main(String[] args) {
        int n=3;
     for(int row=3;row>=1;row--){
        for(int spaces=1;spaces<=(n-row);spaces++){
            System.out.print("  ");
        }
        for(int column=1;column<=row;column++){
            System.out.print("* ");
        }
     for (int star=2;star<=row;star++){
         System.out.print("* ");
     }
         System.out.println();
     }

        for(int row=2;row<=3;row++){
            for(int spaces=1;spaces<=(n-row);spaces++){
                System.out.print("  ");
            }
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
            for (int star=2;star<=row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}