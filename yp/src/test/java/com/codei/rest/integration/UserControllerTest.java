package com.codei.rest.integration;

import com.codei.rest.user.RegisterResponse;
import com.codei.rest.user.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This is integration test using Spring's TestRestTemplate
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testHello() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/", String.class);
        Assert.assertEquals("Hello YummyPlatter", response.getBody());
    }

    @Test
    public void testRegister() {
        User user = new User();
        user.setEmailId("gs@gs.com");
        user.setFirstName("GS");
        user.setFamilyName("Sri");
        ResponseEntity<RegisterResponse> response = testRestTemplate.postForEntity("/user", user, RegisterResponse.class);
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        RegisterResponse registerResponse = response.getBody();
        Assert.assertEquals(registerResponse.getStatus(), "SUCCESS");
    }

}
