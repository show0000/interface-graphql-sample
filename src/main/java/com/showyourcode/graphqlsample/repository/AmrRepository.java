package com.showyourcode.graphqlsample.repository;

import com.showyourcode.graphqlsample.repository.entity.Amr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Project : graphql-sample
 *
 * @author : showyourcode@gmail.com
 * Created : 2022/08/07 9:11 AM
 * Description:
 */

@Repository
public interface AmrRepository extends JpaRepository<Amr, Integer> {
}
