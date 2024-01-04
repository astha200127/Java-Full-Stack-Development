package OOPS_CONCEPTS.LiveClass_13;

class Dad{
    public String plot()
    {
        return "200 gaj ka plot";
    }
}
class Khushi extends Dad
{
   public void demo()
   {
       plot();
   }
    public String plot()
    {
        return "Khushi coffee point";
    }
}
public class Driver{
    public static void main(String[] args)
    {
        Khushi khushi=new Khushi();
        System.out.println(khushi.plot());
    }
}