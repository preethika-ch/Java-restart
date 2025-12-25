import java.util.*;
public class hello{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a;
    do{
    a=sc.nextInt();
    if(a==1) {
        System.out.println("enter the marks");
        int m=sc.nextInt();
        if(m>=90){
            System.out.println("Excellent");
        }
        else if(m>=60){
            System.out.println("Good");}
        else if(m>=0){
            System.out.println("Work Hard");
        }
        else{
            System.out.println("invalid");
        }
        }
    else {
        break;
    }
    }while(a==1);
    }
    }
