package scroogecoin;

public class TestSpecJava {

    public static void main(String[] args) {
        Test test = new Test();
        Test.InnerTest testInner = test.new InnerTest("Test Value");
        assert testInner.getInnerTestName() == "Test Value";

    }
}
