import java.util.*;
public class FCP004{
	public static void main(String [] args){
	Scanner scan= new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	if (b != 0 && 1 <= a && a <= b) {
	int f;
	int g;
	f=a/b;
	g=a%b;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(f);
	System.out.println(g);}
}
}