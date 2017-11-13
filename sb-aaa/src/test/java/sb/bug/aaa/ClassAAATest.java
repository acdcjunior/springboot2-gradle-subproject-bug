package sb.bug.aaa;

import org.junit.Test;

import sb.bug.bbb.ClassBBB;
import sb.bug.bbb.ClassBBBTest;

public class ClassAAATest {

    @Test
    public void classAtDomainIsAccessible() {
        ClassBBB classBBB = ClassBBBTest.create();
        System.out.println(classBBB);
    }

}
