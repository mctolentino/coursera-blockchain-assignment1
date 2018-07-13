package scroogecoin

import spock.lang.Specification
import sun.misc.BASE64Encoder

import javax.crypto.Cipher
import java.nio.charset.StandardCharsets
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.PrivateKey
import java.security.PublicKey


class TxHandlerSpec extends Specification {

    def setup() {
    }

    def 'Should initialize Transaction Handler using a pool of unspent transaction output'() {
        given:
        UTXOPool pool = new UTXOPool()
        TxHandler handler = new TxHandler(pool)

        expect:
        handler.getTxnPoolSize() == 0
    }

    def 'Should validate transactions'() {
            PRGen
    }
}
