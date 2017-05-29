package coinbase.api.v2.service.auth;

public class JvmBasedTimestampProvider implements ICoinbaseTimestampProvider {

    @Override
    public int getTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

}
