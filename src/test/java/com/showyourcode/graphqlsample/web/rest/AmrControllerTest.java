package com.showyourcode.graphqlsample.web.rest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;


/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/15 10:09 AM
 * Description:
 */

@SpringBootTest
@AutoConfigureGraphQlTester
public class AmrControllerTest {
    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    @DisplayName("Amr 정보조회")
    void getAmrById() {
        this.graphQlTester.documentName("amr")
                .variable("amrId", 1)
                .execute()
                .path("amrById.amrId")
                .entity(Integer.class)
                .isEqualTo(Integer.valueOf(1));
    }
}