import java.util.*;
public class slip25a {
    public static void main(String[]args)
    {
        String input="madam";
        if(input.equals(new StringBuilder(input).reverse().toString())){
            System.out.println(input+" is a plaindrom");
        }
        else{
            System.out.println(input+"is not a plaindrom");
        }
    }
}
