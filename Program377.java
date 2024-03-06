
import java.util.*;

class Program377
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();     

        StringBuffer sbobj = new StringBuffer(str);

        sbobj = sbobj.reverse();

        System.out.println(sbobj);
    }
}