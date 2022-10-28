package com.showyourcode.graphqlsample.web.graphql;

import com.showyourcode.graphqlsample.repository.dto.AmrDto;
import com.showyourcode.graphqlsample.repository.entity.Amr;
import com.showyourcode.graphqlsample.repository.service.DataService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/07 10:07 AM
 * Description:
 */

@RestController
@RequestMapping("/")
public class AmrGraphQlController {
    private DataService dataService;

    public AmrGraphQlController(DataService dataService) {
        this.dataService = dataService;
    }

    @QueryMapping
    @GetMapping("/amrs")
    Iterable<AmrDto> amrs() {
        return dataService.findAllAmrList();
    }

    @QueryMapping
    Amr amrById(@Argument int amrId) {
        return dataService.findAmrByAmrId(amrId);
    }

    @MutationMapping
    AmrDto addAmr(@Argument AmrInput amr) {
        return dataService.addNewAmr(amr.amrName);
    }

    record AmrInput(String amrName) {
    }
}
