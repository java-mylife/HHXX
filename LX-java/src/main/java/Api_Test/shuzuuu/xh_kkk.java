package Api_Test.shuzuuu;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;

public class xh_kkk {

    public static void main(String[] args) throws URISyntaxException {

        for (int i = 0; i <24; i++) {
            for (int j = 0; j <60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.println(i+":"+j+":"+k);
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(k);
                }

            }


            URI uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("www.google.com")
                    .setPath("/search")
                    .setParameter("q", "httpclient")
                    .setParameter("btnG", "Google Search")
                    .setParameter("aq", "f")
                    .setParameter("oq", "")
                    .build();
            HttpGet httpget = new HttpGet(uri);
            System.out.println(httpget.getURI());
        }
    }
}
