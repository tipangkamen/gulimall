package com.xiaozhu.gulimallsearch;

import org.elasticsearch.client.RestClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallSearchApplicationTests {

    @Autowired
    private RestClient restClient;
    @Test
    public void contextLoads() {
    }
    @Test
    public void testRestClient(){
        System.out.println(restClient);
    }

}
