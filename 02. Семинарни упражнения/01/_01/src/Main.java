import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int constnum = 10;
        int finalnumber = 0;

        while (finalnumber == 10 || finalnumber < 1000) {
            finalnumber = constnum + n;
            if(finalnumber > 999){
                break;
            }
            else {
                System.out.println(finalnumber);
                n += 10;
            }
        }

    }
}