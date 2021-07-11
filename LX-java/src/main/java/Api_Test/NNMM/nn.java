package Api_Test.NNMM;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class nn {


    public static void main(String[] args) throws IOException {

        {
//            String res = null;
            String url = "http://wwww.baidu.com";
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpClient client = HttpClients.createDefault();
            HttpResponse response = client.execute(httpGet);
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
            client.close();

        }
    }
}


