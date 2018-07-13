package scroogecoin;

public class TxHandler {

    private UTXOPool txnPool;

    /**
     * Creates a public ledger whose current scroogecoin.UTXOPool (collection of unspent transaction outputs) is
     * {@code utxoPool}. This should make a copy of utxoPool by using the scroogecoin.UTXOPool(scroogecoin.UTXOPool uPool)
     * constructor.
     */
    public TxHandler(UTXOPool utxoPool) {
        txnPool = new UTXOPool(utxoPool);
    }

    /**
     * @return true if:
     * (1) all outputs claimed by {@code tx} are in the current scroogecoin.UTXO pool,
     * (2) the signatures on each input of {@code tx} are valid,
     * (3) no scroogecoin.UTXO is claimed multiple times by {@code tx},
     * (4) all of {@code tx}s output values are non-negative, and
     * (5) the sum of {@code tx}s input values is greater than or equal to the sum of its output
     * values; and false otherwise.
     */
    public boolean isValidTx(Transaction tx) {
        // IMPLEMENT THIS
        return false;
    }

    protected boolean allOutputsClaimedAreInUnspentTransactionsOutputsPool() {
        return false;
    }

    protected boolean allSignaturesOnEachInputAreValid() {
        return false;
    }

    protected boolean noOutputIsClaimedMultipleTimes() {
        return false;
    }

    protected boolean allOfTransactionOutputsAreNonNegative() {
        return false;
    }

    protected boolean inputValueSumAreGreaterThanOrEqualToOutputValueSum() {
        return false;
    }

    /**
     * Handles each epoch by receiving an unordered array of proposed transactions, checking each
     * transaction for correctness, returning a mutually valid array of accepted transactions, and
     * updating the current scroogecoin.UTXO pool as appropriate.
     */
    public Transaction[] handleTxs(Transaction[] possibleTxs) {
        // IMPLEMENT THIS
        return null;
    }

    public int getTxnPoolSize() {
        return txnPool.getAllUTXO().size();
    }

}
