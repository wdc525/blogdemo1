package com.inet;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ---
 * @date 3/6/2020
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {

    @Test
    public void Test1(){
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println("aaaaaaaa"+version);
        System.out.println(version1);
    }
}
