import java.util.Scanner;
public class p9_ForLoop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=obj.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }
}
