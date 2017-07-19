package com.maihe.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Leizhen on 2017/7/12.
 */
@Repository
public interface InputDataRepository {

  @Transactional
  int execMultiInsertSql(String sql);
}
