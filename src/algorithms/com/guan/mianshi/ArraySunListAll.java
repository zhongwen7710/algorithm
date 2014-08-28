package algorithms.com.guan.mianshi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraySunListAll {

	public static void main(String[] args) {
		String [] array = new String[]{"1","2","3","4"};
		//Arrays.asList(array): 返回一个受指定数组支持的固定大小的列表。
		System.out.println("Arrays:" + Arrays.asList(array));
		listAll(Arrays.asList(array),"");

	}

	private static void listAll(List<String> asList, String string) {
		//System.out.println("数组的大小：" + asList.size());
		//System.out.println("asList:"+ asList);
		
		for(int i=0; i<asList.size(); i++){
			List<String> temp = new LinkedList<String>(asList);
			System.out.println(temp);
			//递归调用
			//[1, 2, 3, 4]--[2, 3, 4]--[3, 4]--[4]
			//								 --[3]
			//[1, 2, 3, 4]--[2, 3, 4]--[2, 4]--[4]
			//								 --[2]
			//[1, 2, 3, 4]--[2, 3, 4]--[2, 3]
			//…………………………
			//[1, 2, 3, 4]--[1, 3, 4]--
			//[1, 2, 3, 4]--[1, 2, 4]--
			//[1, 2, 3, 4]--[1, 2, 3]--
			
			listAll(temp, string + temp.remove(i));
			//System.out.println("后缀：" + string + temp.remove(i));
		}
		
	}

}
