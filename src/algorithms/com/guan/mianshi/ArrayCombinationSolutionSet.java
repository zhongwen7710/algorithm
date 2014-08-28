package algorithms.com.guan.mianshi;

/**
 * ���������һ�������У�����ȫ����������
 * ��������baidu���ѧϰ���ԣ�http://blog.csdn.net/luoweifu/article/details/12685169
 * ����һ������A=[a_0, a_1, a-2, ... a_n](����n�ɱ�)����ӡ������ֵԪ�ص�������ϡ�
 * 
 */
public class ArrayCombinationSolutionSet {

	public static void main(String[] args) {
		int[] arrays = { 4, 5, 6, 5, 6, 7, 8, 9, 10, 9 };
		int[][] result = new int[20][20];
		int num = func(arrays, result);
		System.out.println("��ϵ��ܸ���Ϊ��" + arrays.length);
		System.out.println("��ϵ��ܸ���Ϊ��" + num);
		System.out.println("��ϵ�������Ϊ��" + result);

	}

	// arrayΪҪ��ϵ����飬sizeΪ����,firstIndexΪҪ�������������ǰ���Ԫ��,result����������ϣ�ÿһ��Ϊһ�����
	public static int func(int[] arrays, int[][] result) {
		// ���еݹ�Ľ����������result�У�������Ͳ����Ͻ�������������
		// ���ر��εݹ���ϵĸ���
		int size = arrays.length;
		if (size == 0) // ���û��Ԫ�أ��������µݹ�
			return 0;

		int num = 0; // ����ݹ���������
		int subnum = 0; // ����ÿ��Ԫ����ΪͷԪ�أ�����Ԫ�ص���ϸ������ݹ鷵�أ�
		for (int i = 0; i < size; i++) {
			int[] newArray = new int[size - 1];
			for (int j = 0, k = 0; j < size; j++) { // ��ȡ������������
				if (j != i)
					newArray[k++] = arrays[j];
			}
			subnum = func(newArray, result); // �ݹ飬�Ժ������������ϣ���������array[i]��ͷ�������
			num += subnum;
			// ����Ϻõ������������е�ÿ����Ϸ���array[i]���棬���ɱ������ϣ����浽������
			int j = result.length - subnum; // ��ʾ������ϵĽ�������п�ʼ����,result.length��ʾ������������
			while (j < result.length)
				result[j++][result.length - size] = arrays[i];// ��ͷԪ�ؼ���
		}
		return num;
	}

	/**
	 * 
	 * @param total
	 * @param a
	 */
	// ֻ��һ����Ͽ��Բ��ñ��������˼·����������ϵĻ�������������ܾͲ�̫�����ˡ�
	// ��������ñ�����������֦���������ȶԸ��������������������������������������У�
	// ��������м����ͽ������Ԥ�ȸ�����������ô�Ͳ��ü��������ˣ���Ϊ�����Ԫ�ض����ڵ��ڵ�ǰ��Ԫ�أ����������������ˣ���
	public void find(int total, int[] a) {
		if (a == null || a.length == 0)
			return;
		// ������Ϊ��������ʱ���Խ��м�֦
		java.util.Arrays.sort(a);
		final int length = a.length;
		int[] resultArray = new int[length];
		for (int i = 0; i < length; i++) {
			resultArray[i] = 0;
		}
		resultArray[0] = 1;
		int count = 0;
		// int t_count = 0;
		int arrayLocationIndex = 1;		// ��ʶresultArray���ж��ٸ�λ�ò�Ϊ0
		int tempNumber = 1;				// ��־��ǰ�Ѿ�����resultArray���ĸ��±�
		while (true) {
			// t_count++;if(t_count == 100) break;
			if (resultArray[0] == length + 1)
				break;					// ѭ����������
			int temp = 0;
			// forѭ�����㵱ǰ���
			// System.out.println(java.util.Arrays.toString(resultArray));
			for (int i = 0; i < resultArray.length; i++) {
				if (resultArray[i] != 0) {
					temp += a[resultArray[i] - 1];
				}
			}
			if (temp == total) {// �õ���һ�����������Ľ��
				count++;
				// ��ӡ������������
				System.out.println(java.util.Arrays.toString(resultArray));
				for (int i = 0; i < resultArray.length; i++) {
					if (resultArray[i] != 0) {
						System.out.print(a[resultArray[i] - 1] + " ");
					}
				}
				System.out.println();
				if (arrayLocationIndex == 1) {
					// ���������������ֻ��һ��Ԫ�أ���ô������1(a�е��±�)
					resultArray[0]++;
				} else {
					// ��resultArray�����һ����Ϊ0����Ϊ0��ͬʱ�ѵ����ڶ���Ԫ�أ�1
					resultArray[tempNumber] = 0;
					resultArray[arrayLocationIndex++]++;
					tempNumber = arrayLocationIndex;
				}
			}
			if (temp < total) {
				// System.out.println("temp < total arrayLocationIndex ["+arrayLocationIndex+"]tempNumber["+tempNumber+"]");
				// System.out.println(java.util.Arrays.toString(resultArray));
				if (tempNumber < length) {
					// ���������һ��
					tempNumber++;
					resultArray[arrayLocationIndex] = tempNumber;
					arrayLocationIndex++;
				} else {
					// �Ѿ���a������ˣ�����
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
					// ��a���������ˣ�����
					resultArray[arrayLocationIndex - 2]++;
					tempNumber = resultArray[arrayLocationIndex - 2];
					resultArray[arrayLocationIndex - 1] = 0;
					arrayLocationIndex--;
				} else {
					// ������temp < total��֧
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
