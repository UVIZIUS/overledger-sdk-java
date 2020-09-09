package network.quant.ethereum.experimental.dto;

import org.web3j.crypto.RawTransaction;

import java.math.BigInteger;


public class EthRawTransactionResponse extends RawTransaction {

    String code;

    public EthRawTransactionResponse(BigInteger nonce, BigInteger gasPrice, BigInteger gasLimit, String to, BigInteger value, String data) {
        super(nonce, gasPrice, gasLimit, to, value, data);
    }

    public EthRawTransactionResponse(BigInteger nonce, BigInteger gasPrice, BigInteger gasLimit, String to, BigInteger value, String data, String code) {
        super(nonce, gasPrice, gasLimit, to, value, data);
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return "EthRawTransactionResponse{" +
                "code='" + code + '\'' +
                ", nonce=" + getNonce() +
                ", gasPrice=" + getGasPrice() +
                ", gasLimit=" + getGasLimit() +
                ", to=" + getTo() +
                ", data=" + getData() +
                ", value=" + getValue() +
                '}';
    }
}
