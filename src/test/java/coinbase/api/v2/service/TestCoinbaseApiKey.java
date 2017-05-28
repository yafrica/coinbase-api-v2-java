package coinbase.api.v2.service;

import org.junit.Test;

public class TestCoinbaseApiKey {
    
    @Test
    public void testBuildApiKeyGet() throws Exception {
        CoinbaseApiKey key = CoinbaseApiKey.build("123", "get", "/user", "{json : \"OK\"}");
        System.out.println(key.getAccessKey());
        System.out.println(key.getAccessSign());
        System.out.println(key.getAccessTimestamp());
    }
    
    @Test
    public void testBuildApiKeyPost() throws Exception {
        CoinbaseApiKey key = CoinbaseApiKey.build("123", "POST", "/user", null);
        System.out.println(key.getAccessKey());
        System.out.println(key.getAccessSign());
        System.out.println(key.getAccessTimestamp());
    }

}
