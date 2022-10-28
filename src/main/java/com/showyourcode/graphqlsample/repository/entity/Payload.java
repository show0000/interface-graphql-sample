package com.showyourcode.graphqlsample.repository.entity;

import lombok.Getter;

import javax.persistence.*;

/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/07 9:08 AM
 * Description:
 */

@Entity
@Getter
public class Payload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payloadId;
    private String payloadName;
    private String payloadType;
    private int usage;
}
