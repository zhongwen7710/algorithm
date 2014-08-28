package algorithms.com.guan.mianshi;

/**
 * 本方法解决一个数组中，给出全部排列问题
 * 问题来自baidu深度学习面试：http://blog.csdn.net/luoweifu/article/details/12685169
 * 给出一个数据A=[a_0, a_1, a-2, ... a_n](其中n可变)，打印出该数值元素的所有组合。
 * 
 */
public class ArrayCombinationSolutionSet {

	public static void main(String[] args) {
		int[] arrays = { 4, 5, 6, 5, 6, 7, 8, 9, 10, 9 };
		int[][] result = new int[20][20];
		int num = func(arrays, result);
		System.out.println("组合的总个数为：" + arrays.length);
		System.out.println("组合的总个数为：" + num);
		System.out.println("组合的总排列为：" + result);

	}

	// array为要组合的数组，size为长度,firstIndex为要放在所以组合最前面的元素,result保存所有组合，每一行为一个组合
	public static int func(int[] arrays, int[][] result) {
		// 所有递归的结果都保存在result中，并且最低层的组合结果保存在最后列
		// 返回本次递归组合的个数
		int size = arrays.length;
		if (size == 0) // 如果没有元素，不再向下递归
			return 0;

		int num = 0; // 本层递归的总组合数
		int subnum = 0; // 本层每个元素作为头元素，其他元素的组合个数（递归返回）
		for (int i = 0; i < size; i++) {
			int[] newArray = new int[size - 1];
			for (int j = 0, k = 0; j < size; j++) { // 获取待排序子数组
				if (j != i)
					newArray[k++] = arrays[j];
			}
			subnum = func(newArray, result); // 递归，对后面的子数组组合，并返回以array[i]开头的组合数
			num += subnum;
			// 将组合好的所有新数组中的每个组合放在array[i]后面，构成本层的组合，保存到数组中
			int j = result.length - subnum; // 表示本次组合的结果从哪行开始插入,result.length表示数组已有行数
			while (j < result.length)
				result[j++][result.length - size] = arrays[i];// 将头元素加上
		}
		return num;
	}

	/**
	 * 
	 * @param total
	 * @param a
	 */
	// 只求一个组合可以采用背包问题的思路，求所有组合的话，背包问题可能就不太适用了。
	// 这里面采用暴力搜索＋剪枝，具体是先对给定的数组进行排序，在求解的深度优先搜索过程中，
	// 如果出现中间的求和结果大于预先给定的数，那么就不用继续搜索了（因为后面的元素都大于等于当前的元素，不用再往后搜索了）。
	public void find(int total, int[] a) {
		if (a == null || a.length == 0)
			return;
		// 排序是为了在深搜时可以进行剪枝
		java.util.Arrays.sort(a);
		final int length = a.length;
		int[] resultArray = new int[length];
		for (int i = 0; i < length; i++) {
			resultArray[i] = 0;
		}
		resultArray[0] = 1;
		int count = 0;
		// int t_count = 0;
		int arrayLocationIndex = 1;		// 标识resultArray中有多少个位置不为0
		int tempNumber = 1;				// 标志当前已经到了resultArray的哪个下标
		while (true) {
			// t_count++;if(t_count == 100) break;
			if (resultArray[0] == length + 1)
				break;					// 循环跳出条件
			int temp = 0;
			// for循环计算当前结果
			// System.out.println(java.util.Arrays.toString(resultArray));
			for (int i = 0; i < resultArray.length; i++) {
				if (resultArray[i] != 0) {
					temp += a[resultArray[i] - 1];
				}
			}
			if (temp == total) {// 得到了一个符合条件的结果
				count++;
				// 打印这个结果的内容
				System.out.println(java.util.Arrays.toString(resultArray));
				for (int i = 0; i < resultArray.length; i++) {
					if (resultArray[i] != 0) {
						System.out.print(a[resultArray[i] - 1] + " ");
					}
				}
				System.out.println();
				if (arrayLocationIndex == 1) {
					// 这种情况下数组中只有一个元素，那么把它加1(a中的下标)
					resultArray[0]++;
				} else {
					// 把resultArray中最后一个不为0的置为0，同时把倒数第二个元素＋1
					resultArray[tempNumber] = 0;
					resultArray[arrayLocationIndex++]++;
					tempNumber = arrayLocationIndex;
				}
			}
			if (temp < total) {
				// System.out.println("temp < total arrayLocationIndex ["+arrayLocationIndex+"]tempNumber["+tempNumber+"]");
				// System.out.println(java.util.Arrays.toString(resultArray));
				if (tempNumber < length) {
					// 继续添加下一个
					tempNumber++;
					resultArray[arrayLocationIndex] = tempNumber;
					arrayLocationIndex++;
				} else {
					// 已经到a的最后了，回退
					if (resultArray[arrayLocationIndex - 1] == length)
						break;
					resultArray[arrayLocationIndex - 1] = 0;
					resultArray[arrayLocationIndex - 2]++;
					tempNumber = arrayLocationIndex;
				}
				// System.out.println(java.util.Arrays.toString(resultArray));
			}
			if (temp > total) {
				// System.out.println("temp > total arrayLocationIndex ["+arrayLocationIndex+"]tempNumber["+tempNumber+"]");
				// System.out.println(java.util.Arrays.toString(resultArray));
				if (tempNumber == 1) {
					// System.out.println("tempNumber == 1");
					break;
				}
				if (tempNumber == length) {
					// 到a数组的最后了，回退
					resultArray[arrayLocationIndex - 2]++;
					tempNumber = resultArray[arrayLocationIndex - 2];
					resultArray[arrayLocationIndex - 1] = 0;
					arrayLocationIndex--;
				} else {
					// 类似于temp < total分支
					resultArray[arrayLocationIndex - 1] = 0;
					resultArray[arrayLocationIndex - 2]++;
					tempNumber = resultArray[arrayLocationIndex - 2];
					arrayLocationIndex--;
				}
				// tempNumber = resultArray[arrayLocationIndex-1]+1;
				// System.out.println(java.util.Arrays.toString(resultArray));
			}
		}
		System.out.println(count);
	}

}
