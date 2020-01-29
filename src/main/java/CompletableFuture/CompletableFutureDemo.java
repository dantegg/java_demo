package main.java.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public class CompletableFutureDemo {
    public static void main(String... args) {
        CompletableFuture<Float> getStockFuture = CompletableFuture.supplyAsync(new StockSupplier());
        getStockFuture.thenAccept(new Consumer<Float>() {
            @Override
            public void accept(Float price) {
                System.out.println("Current price:" + price);
            }

        });
        getStockFuture.exceptionally(new Function<Throwable, Float>() {
            @Override
            public Float apply(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
                return Float.NaN;
            }
        });
        getStockFuture.join();
    }
}
