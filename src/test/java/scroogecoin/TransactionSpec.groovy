package scroogecoin

import spock.lang.Specification

class TransactionSpec extends Specification {

    def 'Should be able to add a valid transaction input'() {
        given:
        byte[] prevHash = '1234' as byte[]
        int index = 55
        Transaction tx = new Transaction()

        when:
        tx.addInput(prevHash, index)
        Transaction.Input input = tx.getInput(0)

        then:
        tx.numInputs() == 1
        input.signature == null
        input.outputIndex == 55
    }
}
