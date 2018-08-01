package com.ryan.oauth2.org;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrgApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void when_callApi_expect_unauthorized() throws Exception {

    }

    @Test
    public  void generate_password() throws Exception {
        String password = "123456";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);

        System.out.println("password : " + encodedPassword);
    }

}
