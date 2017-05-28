package coinbase.api.v2.exception;

public class CoinbaseHttpException extends Exception {

    private static final long serialVersionUID = 1L;

    public CoinbaseHttpException() {
        super();
    }

    public CoinbaseHttpException(String message) {
        super(message);
    }

    public CoinbaseHttpException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinbaseHttpException(Throwable cause) {
        super(cause);
    }

    protected CoinbaseHttpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
