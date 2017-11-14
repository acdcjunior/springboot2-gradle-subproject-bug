package sb.bug.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sb.bug.bbb.ClassBBB;

@SpringBootApplication
public class ClassAAA {

    public static void main(String[] args) {
        System.out.println(ClassBBB.class.getCanonicalName());
        SpringApplication.run(ClassAAA.class, args);
    }

}