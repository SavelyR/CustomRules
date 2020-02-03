package org.sonar.samples.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class CustomCheckForDefineClassTest {
    @Test
    public void test() {
        JavaCheckVerifier.verify("src/test/files/CustomCheckForDefineClass.java", new CustomCheckForDefineClass());
    }
}
