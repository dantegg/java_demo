package ConcurrentFuture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class DownloadTask implements Callable<String> {
    String url;

    public DownloadTask(String url) {
        this.url = url;
    }

    @Override
    public String call() throws Exception {
        System.out.println("start download" + url + "....");
        URLConnection conn = new URL(this.url).openConnection();
        conn.connect();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String s = null;
            StringBuilder sb = new StringBuilder();
            while ((s = reader.readLine()) != null) {
                sb.append(s).append("\n");
            }
            return sb.toString();
        }
    }
}
