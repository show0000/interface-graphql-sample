package com.showyourcode.graphqlsample.web.rest;

import com.showyourcode.graphqlsample.repository.dto.AmrDto;
import com.showyourcode.graphqlsample.repository.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/07 10:04 AM
 * Description:
 */

//@RestController
//@RequestMapping("/")
public class AmrRestController {
    private DataService dataService;

    public AmrRestController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/amrs")
    Iterable<AmrDto> getAllAmrs() {
        return dataService.findAllAmrList();
    }

    @GetMapping("/amrs/{amrId}")
    AmrDto getAmr(@PathVariable int amrId) {
        return AmrDto.from(dataService.findAmrByAmrId(amrId));
    }
}
