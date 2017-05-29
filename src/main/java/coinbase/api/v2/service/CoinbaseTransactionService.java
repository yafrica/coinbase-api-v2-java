package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbaseTransaction;
import coinbase.api.v2.bean.operation.CoinbaseRequestMoney;
import coinbase.api.v2.bean.operation.CoinbaseSendMoney;
import coinbase.api.v2.bean.operation.CoinbaseTransferMoney;
import coinbase.api.v2.bean.response.ListCoinbaseTransaction;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseTransactionService extends AbstractCoinbaseService {
	
	public CoinbaseTransactionService(ICoinbaseTimestampProvider timeService) {
        super(timeService);
    }

    public ListCoinbaseTransaction list(CoinbaseAuthenticationBearer auth, String accountId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/transactions", ListCoinbaseTransaction.class, false);
    }
	
	public CoinbaseTransaction show(CoinbaseAuthenticationBearer auth, String accountId, String transactionId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/transactions/" + transactionId, CoinbaseTransaction.class, false);
    }
	
	public CoinbaseTransaction send(CoinbaseAuthenticationBearer auth, String accountId, CoinbaseSendMoney sendMoney) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/transactions", CoinbaseTransaction.class, sendMoney);
    }
	
	/**
	 * https://developers.coinbase.com/api/v2#transfer-money-between-accounts
	 * 
	 * Transfer bitcoin, litecoin or ethereum between two of a user’s accounts. Following transfers are allowed:
	 * - wallet to wallet
	 * - wallet to vault
	 * 
	 * Scopes : wallet:transactions:transfer
	 * 
	 * @param auth
	 * @param accountId
	 * @param transferMoney
	 * @return
	 * @throws CoinbaseHttpException
	 */
	public CoinbaseTransaction transferMoney(CoinbaseAuthenticationBearer auth, String accountId, CoinbaseTransferMoney transferMoney) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/transactions", CoinbaseTransaction.class, transferMoney);
    }
	
	/**
	 * https://developers.coinbase.com/api/v2#request-money
	 * 
	 * Requests money from an email address.
	 * 
	 * Scopes : wallet:transactions:request
	 * 
	 * @param auth
	 * @param accountId
	 * @param requestMoney
	 * @return
	 * @throws CoinbaseHttpException
	 */
	public CoinbaseTransaction requestMoney(CoinbaseAuthenticationBearer auth, String accountId, CoinbaseRequestMoney requestMoney) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/transactions", CoinbaseTransaction.class, requestMoney);
    }
	
	/**
	 * https://developers.coinbase.com/api/v2#complete-request-money
	 * 
	 * Complete request money
	 * 
	 * Lets the recipient of a money request complete the request by sending money to the user who requested the money. 
	 * This can only be completed by the user to whom the request was made, not the user who sent the request.
	 * 
	 * Scopes : wallet:transactions:request
	 * 
	 * @param auth
	 * @param accountId
	 * @param transactionId
	 * @throws CoinbaseHttpException
	 */
	public void completeRequestMoney(CoinbaseAuthenticationBearer auth, String accountId, String transactionId) throws CoinbaseHttpException {
        doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/transactions/" + transactionId + "/complete");
    }
	
	/**
	 * https://developers.coinbase.com/api/v2#re-send-request-money
	 * 
	 * Re-send request money
	 * 
	 * Lets the user resend a money request. This will notify recipient with a new email.
	 * 
	 * Scopes : wallet:transactions:request
	 * 
	 * @param auth
	 * @param accountId
	 * @param transactionId
	 * @throws CoinbaseHttpException
	 */
	public void resendRequestMoney(CoinbaseAuthenticationBearer auth, String accountId, String transactionId) throws CoinbaseHttpException {
        doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/transactions/" + transactionId + "/resend");
    }
	
	/**
	 * https://developers.coinbase.com/api/v2#cancel-request-money
	 * 
	 * Cancel request money
	 * 
	 * Lets a user cancel a money request. Money requests can be canceled by the sender or the recipient.
	 * 
	 * Scopes : wallet:transactions:request
	 * 
	 * @param auth
	 * @param accountId
	 * @param transactionId
	 * @throws CoinbaseHttpException
	 */
	public void cancelRequestMoney(CoinbaseAuthenticationBearer auth, String accountId, String transactionId) throws CoinbaseHttpException {
        doQuery(auth, CoinbaseHttpMethod.DELETE, "/accounts/" + accountId + "/transactions/" + transactionId);
    }

}
