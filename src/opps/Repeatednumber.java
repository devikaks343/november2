package opps;

public class Repeatednumber {

	public static void main(String[] args) {
		String s="malayalam";
		char st[]=s.toCharArray();
		int count=0;
		System.out.println("String"+s);
		for(int i=0;i<st.length;i++)
		{
			count=1;
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i]==st[j])
				{
					count++;
					st[j]='0';
				}
			}
			if(count>1 &&  st[i]!='0');
			{
				System.out.println(st[i]);
				System.out.println("count="+count);
			}
			  
		}

		
	}

}
