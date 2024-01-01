package HomeWork;

public class Q4_CharacterOrNumber
{
    public static void main(String[] args)
    {

        char ch=10;
      if(((ch>='a')&&(ch<='z')) || ((ch>='A')&&(ch<='Z')))
      {
          System.out.println(ch+"Given input "+ch+ " is character");
      }
      else if((ch>=0))
      {
//        System.out.println("Given ch "+ch+" is not character");
          System.out.println("Given input "+ch+" is number");
      }

      else
      {
          System.out.println("Given input is not character nor number");
      }
    }
}
