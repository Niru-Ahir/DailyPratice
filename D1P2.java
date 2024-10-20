import java.lang.*;

public class D1P2 {
    public static void main(String[] args) {
        String str = "Rajbha";

        for(int i=str.length()-1;i>=0;i--){
            char[] ch = new char[]{str.charAt(i)};
            System.out.print(ch);
        }
    }
}
