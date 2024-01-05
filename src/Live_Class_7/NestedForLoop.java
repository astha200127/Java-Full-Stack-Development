package Live_Class_7;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<3;i++)
		{
			System.out.println("---Outer Loop Start---");
			for(int j=0; j<3; j++)
			{
				System.out.println("Inner Loop");
			}
			System.out.println("---Outer Loop Ends---");
		}
	}

}
