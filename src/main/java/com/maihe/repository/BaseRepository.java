package com.maihe.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Query;


/**
 * Created by vin on 2017/5/4.
 */
@Repository
public interface BaseRepository {
  List<Object[]> selectByNativeSQL(String sql);
  @Transactional
  int updateByNativeSQL(String sql);
}

