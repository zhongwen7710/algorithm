package algorithms.com.guan.mianshi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * discuz论坛apache日志格式如下：
 * 183.131.11.98 - - [01/Aug/2014:01:01:05 +0800] "GET /thread-5981-1-1.html HTTP/1.1" 200 18152 "http://www.baidu.com/s?wd=cocos2dx%203.2%20wp8%E6%94%AF%E6%8C%81&pn=30&oq=cocos2dx%203.2%20wp8%E6%94%AF%E6%8C%81&tn=28035039_2_pg&ie=utf-8&rsv_page=1" "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.107 UBrowser/1.0.349.1252 Safari/537.36"
 * 
 * 要求：通过上面的日志，获得如下属性
 * 		1.ip地址
 * 		2.访问时间
 * 		3.url地址
 * 		4.用户使用浏览器
 *
 */
public class UsingHadoopParseApacheRizhi {

        public static void StringResolves(String line) throws ParseException {
                String ipField, dateField, urlField, browserField;

                // 获取ip地址
                ipField = line.split("- -")[0].trim();

                // 获取时间,并转换格式
                int getTimeFirst = line.indexOf("[");
                int getTimeLast = line.indexOf("]");
                String time = line.substring(getTimeFirst + 1, getTimeLast).trim();
                Date dt = null;
                DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
                dt = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.US).parse(time);
                dateField = df1.format(dt);

                // 获取url
                String[] getUrl = line.split("\"");

                String firtGeturl = getUrl[1].substring(3).trim();

                String secondGeturl = getUrl[3].trim();
                urlField = firtGeturl + "分隔符" + secondGeturl;

                // 获取浏览器
                String[] getBrowse = line.split("\"");
                String strBrowse = getBrowse[5].toString();
                String str = "(KHTML, like Gecko)";
                int i = strBrowse.indexOf(str);
                strBrowse = strBrowse.substring(i);
                String strBrowse1[] = strBrowse.split("\\/");
                strBrowse = strBrowse1[0].toString();
                String strBrowse2[] = strBrowse.split("\\)");
                strBrowse = strBrowse2[1].trim();

                System.out.println(ipField);
                System.out.println(dateField);
                System.out.println(urlField);
                System.out.println(strBrowse);

        }

        public static void main(String[] args) throws ParseException {
                // TODO Auto-generated method stub
                String browser = "203.100.80.88 - - [01/Aug/2014:19:04:58 +0800] \"GET /uc_server/avatar.php?uid=3841&size=small HTTP/1.1\" 301 463 \"http://www.aboutyun.com/forum.php\" \"Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.95 Safari/537.36 SE 2.X MetaSr 1.0";

                UsingHadoopParseApacheRizhi.StringResolves(browser);

        }

}
