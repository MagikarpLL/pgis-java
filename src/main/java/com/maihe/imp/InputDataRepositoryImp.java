package com.maihe.imp;

import com.maihe.repository.InputDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by Leizhen on 2017/7/12.
 */
@Repository
public class InputDataRepositoryImp implements InputDataRepository{
  @PersistenceContext
  @Autowired
  private EntityManager entityManager;

  @Override
  public int execMultiInsertSql(String sql) {
    try {
      Query query = entityManager.createNativeQuery(sql);
      int result = query.executeUpdate();
      return result;
    }catch(Exception e){
      int result = 0;
      return result;
    }
  }
}
