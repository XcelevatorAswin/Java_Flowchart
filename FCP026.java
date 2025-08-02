import java.util.*;
public class FCP026{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int m=scan.nextInt();
int n=scan.nextInt();
int sum=0;
while(m<=n){
sum=sum+m;
m=m+1;}
System.out.println(sum);
}
}