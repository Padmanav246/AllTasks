package task_on_collection;
import java.util.*;

public class Question_2 {
	public static void main(String...strings)
	{
		String[] str= {"one","two","three","four","five","six","seven","Eight","nine","ten"};
		
		List<String> a1=new ArrayList<String>();
//Q-a		Step-1
//		for(int i=0;i<str.length;i++)
//		{
//			a1.add(str[i]);
//		}
//		System.out.println(a1);
		
////		step-2
		Collections.addAll(a1,str);
//		System.out.println(a1);
		
		
//		//step-3
//		List a3 =Arrays.asList(str);
//		System.out.println(a3);
		
		
//Q-b		//ArrayList to Array
		//step-1
		String[] arr=new String[a1.size()];
//		arr=a1.toArray(arr);
		
		//step-2
		int i=0;
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			arr[i]=itr.next();
			i++;
		}
		
		for(i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}
}
