
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i=11;
			i=i++ + ++i;
			
			//i=11, i++=11; ++i=13
			//i=11+13=24
			System.out.println(i);
			
			int a, b, c;
			a=22;
			b=11;
			c=a+b + a++ + b++ + ++a + ++b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			System.out.println("--------------------------------");
			int j=0;
			j=j++ - --j + ++j + j--;
			System.out.println(j);
			System.out.println("--------------------------------");

			int k=3;
			i=1; j=2;
			int m=i-- - j-- - k--;
			System.out.println(i);
			System.out.println(j);
			System.out.println(k);
			System.out.println(m);
			System.out.println("--------------------------------");
			i=19;
			j=29;
			int z=i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
			System.out.println(z);

	}

}
