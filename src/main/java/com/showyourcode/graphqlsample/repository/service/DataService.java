package com.showyourcode.graphqlsample.repository.service;

import com.showyourcode.graphqlsample.repository.AmrRepository;
import com.showyourcode.graphqlsample.repository.dto.AmrDto;
import com.showyourcode.graphqlsample.repository.entity.Amr;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/07 10:38 AM
 * Description:
 */

@Service
public class DataService {
    private AmrRepository amrRepository;

    public DataService(AmrRepository amrRepository) {
        this.amrRepository = amrRepository;
    }

    public List<AmrDto> findAllAmrList() {
        return AmrDto.from(amrRepository.findAll());
    }

    public AmrDto findAmrById(int amrId) {
        return AmrDto.from(amrRepository.findById(amrId)
                .orElseThrow(() -> new IllegalArgumentException()));
    }

    public Amr findAmrByAmrId(int amrId) {
        return amrRepository.findById(amrId).get();
    }
    public AmrDto addNewAmr(String amrName) {
        Amr entity = Amr.builder()
                .amrName(amrName)
                .build();

        return AmrDto.from(amrRepository.save(entity));
    }
}
