package CompletableFuture;

import java.util.function.Supplier;

public class StockSupplier implements Supplier<Float> {

    @Override
    public Float get() {
        String url = "http://hq.sinajs.cn/list=sh000001";
        System.out.println("GET:" + url);
        try {
//            String result = DownloadUtil.downlaod(url);
            String result = "";
            String[] ss = result.split(",");
            return Float.parseFloat(ss[3]);
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
}
