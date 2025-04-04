import java.io.*;
public class bufferedlnp{
    public static void main(String[] args) {
        {
            try{
                FileInputStream fin=new FileInputStream("C:\\Users\\Bhagyashri\\Desktop\\testout.txt"); // testout file exit in d drive
                BufferedInputStream bin=new BufferedInputStream(fin);
                int i;
                while((i=bin.read())!=-1)
                {
                    System.out.println((char)i);

                }
                bin.close();
                fin.close();


            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

