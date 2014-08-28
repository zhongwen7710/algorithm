package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.Scanner;
/**
 *  问题描述：
 * 子网掩码是用来判断任意两台计算机的IP地址是否属于同一子网络的根据。
	子网掩码与IP地址结构相同，是32位二进制数，其中网络号部分全为“1”和主机号部分全为“0”。利用子网掩码可以判断两台主机是否中同一子网中。若两台主机的IP地址分别与它们的子网掩码相“与”后的结果相同，则说明这两台主机在同一子网中。
	示例：
	I P 地址　 192.168.0.1
	子网掩码　 255.255.255.0
	转化为二进制进行运算：
	I P 地址　11010000.10101000.00000000.00000001
	子网掩码　11111111.11111111.11111111.00000000
	AND运算
	 　　　　11000000.10101000.00000000.00000000
	转化为十进制后为：
	 　　　　192.168.0.0
	 
	I P 地址　 192.168.0.254
	子网掩码　 255.255.255.0
	
	转化为二进制进行运算：
	I P 地址　11010000.10101000.00000000.11111110
	子网掩码　11111111.11111111.11111111.00000000
	AND运算
	　　　　　11000000.10101000.00000000.00000000
	转化为十进制后为：
	　　　　　192.168.0.0
	通过以上对两台计算机IP地址与子网掩码的AND运算后，我们可以看到它运算结果是一样的。均为192.168.0.0，所以这二台计算机可视为是同一子网络。
	
	* 功能: 判断两台计算机IP地址是同一子网络。 
	* 输入参数：    String Mask: 子网掩码，格式：“255.255.255.0”； 
	*               String ip1: 计算机1的IP地址，格式：“192.168.0.254”；
	*               String ip2: 计算机2的IP地址，格式：“192.168.0.1”；
	*               
	* 返回值：      0：IP1与IP2属于同一子网络；     1：IP地址或子网掩码格式非法；    2：IP1与IP2不属于同一子网络
	
	public int checkNetSegment(String mask, String ip1, String ip2) 
	{     
	    //在这里实现功能
	    return 0;
	}
 * @author guanxiangqing
 *
 */
public class DetermineIPBelongToTheSameSubnet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			String subNet = scanner.nextLine();
			String ip1 = scanner.nextLine();
			String ip2 = scanner.nextLine();
			if (!(checkIp(subNet) && checkIp(ip1) && checkIp(ip2))) {
				System.out.println(1);
				return;
			}
			String result1 = andResult(subNet, ip1);
			String result2 = andResult(subNet, ip2);
			if (result1.equals(result2)) {
				System.out.println(0);
			} else {
				System.out.println(2);
			}
		} catch (Exception e) {
			System.out.println(1);
		} finally {
			scanner.close();
		}
	}

	private static boolean checkIp(String Ip) {
		String[] temp = Ip.split("\\.");
		if (temp.length != 4) {
			return false;
		}
		for (int i = 0; i < temp.length; i++) {
			int ipTemp = Integer.parseInt(temp[i]);
			if (ipTemp < 0 || ipTemp > 255) {
				return false;
			}
		}
		return true;
	}

	private static String andResult(String subNet, String ip) {
		String[] subNetArray = subNet.split("\\.");
		String[] ipArray = ip.split("\\.");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ipArray.length; i++) {
			sb.append(Integer.parseInt(subNetArray[i])
					& Integer.parseInt(ipArray[i]));
			if (i != ipArray.length - 1) {
				sb.append('.');
			}
		}
		return sb.toString();
	}
}