package com.showyourcode.graphqlsample.repository.dto;

import com.showyourcode.graphqlsample.repository.entity.Payload;
import lombok.Builder;
import lombok.Getter;

/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/07 9:30 AM
 * Description:
 */

@Builder
@Getter
public class PayloadDto {
    private int payloadId;
    private String payloadName;
    private String payloadType;
    private int usage;

    public static PayloadDto from(Payload entity) {
        return PayloadDto.builder()
                .payloadId(entity.getPayloadId())
                .payloadName(entity.getPayloadName())
                .payloadType(entity.getPayloadType())
                .usage(entity.getUsage())
                .build();
    }
}

