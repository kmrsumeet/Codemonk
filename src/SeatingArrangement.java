import java.util.Scanner;

public class SeatingArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int s;
            s = sc.nextInt();
            if(s%12 == 1)
                System.out.println((s+11) + " WS");
            else
            if(s%12 == 2)
                System.out.println((s+9) + " MS");
            else
            if(s%12 == 3)
                System.out.println((s+7) + " AS");
            else
            if(s%12 == 4)
                System.out.println((s+5) + " AS");
            else
            if(s%12 == 5)
                System.out.println((s+3) + " MS");
            else
            if(s%12 == 6)
                System.out.println((s+1) + " WS");
            else
            if(s%12 == 0)
                System.out.println((s-11) + " WS");
            else
            if(s%12 == 11)
                System.out.println((s-9) + " MS");
            else
            if(s%12 == 10)
                System.out.println((s-7) + " AS");
            else
            if(s%12 == 9)
                System.out.println((s-5) + " AS");
            else
            if(s%12 == 8)
                System.out.println((s-3) + " MS");
            else
            if(s%12 == 7)
                System.out.println((s-1) + " WS");
        }

	}

}
