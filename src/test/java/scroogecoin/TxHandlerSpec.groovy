package scroogecoin

import spock.lang.Specification

class TxHandlerSpec extends Specification {

    def 'Should handle transactions'() {
        given:
        TxHandler txHandler = new TxHandler(null)

        when:
        Transaction[] txs = txHandler.handleTxs(null)

        then:
        txs == null
    }


    def 'Should check if transaction is valid'() {
        given:
        UTXOPool pool = new UTXOPool()
        TxHandler txHandler = new TxHandler(pool)
        Transaction tx = new Transaction()

        when:
        boolean isValid = txHandler.isValidTx(tx)

        then:
        isValid == false
    }
}
