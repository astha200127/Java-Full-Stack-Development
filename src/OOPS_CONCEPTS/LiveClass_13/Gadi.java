package OOPS_CONCEPTS.LiveClass_13;
class Gadi
{
    Gadi manufacture()
    {
        System.out.println("Gadi lelo");
        return new Gadi();
    }
}
class Ford extends Gadi
{
    Ford manufacture()
    {
        System.out.println("Ford ki Gadi");
        return new Ford();
    }
}