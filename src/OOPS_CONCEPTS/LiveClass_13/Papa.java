package OOPS_CONCEPTS.LiveClass_13;

public class Papa
{
    public static void main(String[] args)
    {
        Animal animal=new Animal();
        String s=animal.Ranveer();
        System.out.println(s);

        String s1=animal.Rashmika();
        System.out.println(s1);
        System.out.println("====================");
        String s2=animal.Ranveer("Rashmika");
        System.out.println(s2);
        String s3=animal.Rashmika("Ranveer");
        System.out.println(s3);
        int res = animal.Ranveer(10);  //ctrl+alt+v
        System.out.println(res);
        System.out.println(animal.Ranveer(10, 40));
    }
}
