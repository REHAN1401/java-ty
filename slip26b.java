import java.util.Scanner;

class numberException extends  Exception{
    public numberException (String message){
         
        super(message);
    }
}
public class slip26b {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();

        try{
            if(num>1000)
            {
                throw new numberException("number is out of range");
            }
            System.out.println("factors are");
            for(int i=1;i<num;i++)
            {
                if(num%i==0){
                    System.out.print(i);
                }
            }
        }catch(numberException e){
            System.out.println(e.getMessage());
        }

    }
}
