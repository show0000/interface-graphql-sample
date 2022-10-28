package com.showyourcode.graphqlsample.repository.dto;

import com.showyourcode.graphqlsample.repository.entity.Amr;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/07 9:28 AM
 * Description:
 */

@Builder
@Getter
public class AmrDto {
    private int amrId;
    private String amrName;
    private String amrAlias;
    private PayloadDto payload;

    public static List<AmrDto> from(List<Amr> entities) {
        return entities == null ? null : entities.stream()
                .map(AmrDto::from).collect(Collectors.toList());
    }

    public static AmrDto from(Amr entity) {
        return AmrDto.builder()
                .amrId(entity.getAmrId())
                .amrName(entity.getAmrName())
                .payload(Optional.ofNullable(entity.getPayload()).isPresent()
                        ? PayloadDto.from(entity.getPayload()) : null)
                .amrAlias("dtoAlias")
                .build();
    }
}
