import java.io.*;
import java.net.*;
class ser
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket sersock = new ServerSocket(3000);
        System.out.println("Server ready");
        Socket sock = sersock.accept( );
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);
        InputStream istream = sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
        String fun;
        int a,b,c;
while(true)
{
        fun = receiveRead.readLine();
        a = Integer.parseInt(receiveRead.readLine());
        b = Integer.parseInt(receiveRead.readLine());
        if(fun != null)
            System.out.println("Operation : "+fun);
        System.out.println("Parameter 1 : "+a);
        System.out.println("Parameter 2 : "+b);
        if(fun.compareTo("add")==0)
        {
            c=a+b;
            System.out.println("Addition = "+c);
            pwrite.println("Addition = "+c);
        }
        if(fun.compareTo("sub")==0)
        {
            c=a-b;
            System.out.println("Substraction = "+c);
            pwrite.println("Substraction = "+c);
        }
        if(fun.compareTo("mul")==0)
        {
            c=a*b;
            System.out.println("Multiplication = "+c);
            pwrite.println("Multiplication = "+c);
        }
        if(fun.compareTo("div")==0)

        {
            c=a/b;
            System.out.println("Division = "+c);
            pwrite.println("Division = "+c);
        }
        System.out.flush();
 }
    }
}

