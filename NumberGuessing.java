import java.util.*;

public class NumberGuessing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int num=r.nextInt(100);
        int chance=0,f=1,max=100,min=1;
        //int guess=sc.nextInt();
        while(true){
            System.out.println("Guess the random between "+min+" and "+max);
            int guess=sc.nextInt();
            if(num==guess){
                break;
            }else if(num > guess){
                if(chance==6){
                    f=0;
                    break;
                }
                min=guess;
                System.out.println("Number must be Greater than "+guess);
            }else{
                if(chance==6){
                    f=0;
                    break;
                }
                max=guess;
                System.out.println("Number must be less than "+guess);
            }
            chance++;
        }
        if(f==0){
            System.out.println("Given chance are Completed");
            System.out.println("Random number is "+num);
        }else{
            System.out.println("Number is Guessed Successfully");
            System.out.println("No of chances is : "+chance);
            System.out.println("No of chances percentage is : "+(10-chance)*10);
            System.out.println("Random number is "+num);
        }
    }
}