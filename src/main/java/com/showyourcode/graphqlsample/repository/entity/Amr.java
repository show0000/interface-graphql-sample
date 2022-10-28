package com.showyourcode.graphqlsample.repository.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/07 9:00 AM
 * Description:
 */

@Entity
@Getter
@SequenceGenerator(name = "amr_id_seq", initialValue = 6)
public class Amr {
    public Amr() { }
    @Builder
    public Amr(String amrName) {
        this.amrName = amrName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "amr_id_seq")
    private int amrId;
    private String amrName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payloadId", foreignKey = @ForeignKey(name = "amr_payload_id_fk"))
    private Payload payload;

}
