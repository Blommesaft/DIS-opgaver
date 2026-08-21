package Opgave00;

import java.net.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HeaderLines {
    public static void main(String[] args) throws Exception {
//        URL url = new URL("https://dis.students.dk/example1.php");
//        URLConnection conn = url.openConnection();
//        Map map = conn.getHeaderFields();
//        Set set = map.entrySet();
//        Iterator it = set.iterator();

        URL url2 = new URL("https://www.mgeko.cc/reader/en/pug0-the-possessed-grappler-chapter-15-eng-li/");
        URLConnection conn2 = url2.openConnection();
        Map map2 = conn2.getHeaderFields();
        Set set2 = map2.entrySet();
        Iterator it2 = set2.iterator();


        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        String str;
        InputStreamReader r = new InputStreamReader(url2.openStream());
        BufferedReader in = new BufferedReader(r);
        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }
        in.close();
    }
}
