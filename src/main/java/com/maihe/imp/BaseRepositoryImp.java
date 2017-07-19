package com.maihe.imp;

import com.maihe.repository.BaseRepository;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by vin on 2017/5/4.
 */
@Repository
public class BaseRepositoryImp implements BaseRepository {
  @PersistenceContext
  @Autowired
  private EntityManager entityManager;

  @Override
  public List<Object[]> selectByNativeSQL(String sql) {
    Query query = entityManager.createNativeQuery(sql);
    query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
    return query.getResultList();
  }

  @Transactional
  @Override
  public int updateByNativeSQL(String sql) {
    String sqlArray[] = sql.trim().split(";");
    int result = 0;
    for (int i = 0; i < sqlArray.length; i++) {
      String localSql = sqlArray[i];
      //System.out.println(localSql);
      String keyword = localSql.substring(0, 6).toUpperCase();
      if (keyword.equals("SELECT")) {
        return -1;
      } else {
        Query query = entityManager.createNativeQuery(localSql);
        result += query.executeUpdate();
      }
    }
    return result;
  }
}
