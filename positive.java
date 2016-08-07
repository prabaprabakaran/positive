public class Assess {
	public static void main(String[] args) {
		if(args.length!=0)
		{
			int a=Integer.parseInt(args[0]);
			if(a>0)
			{
				System.out.println("positive");
			}
			else if(a==0)
			{
				System.out.println("Either positive or negative  ");
			}
			else if(a<0)
			{
				System.out.println("negative");
			}
		}else{
				System.out.println("excepted");
			}
		}
	}


