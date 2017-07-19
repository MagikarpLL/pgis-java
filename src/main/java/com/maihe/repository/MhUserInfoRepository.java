package com.maihe.repository;

import com.maihe.model.MhUserInfo;
import org.hibernate.annotations.SQLInsert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Qualifier("mhUserInfoRepository")
public interface MhUserInfoRepository extends JpaRepository<MhUserInfo, Integer> {

  @Query("select t from MhUserInfo t where t.userName=:name")
  MhUserInfo findUserByName(@Param("name") String name);

  //利用原生的SQL进行删除操作
  @Query("delete from MhUserInfo t where t.userName=:userName ")
  @Modifying
  @Transactional
  public void deleteUserByUId(@Param("userName") String userName);

  //利用原生的SQL进行修改操作
  @Query( "update MhUserInfo t set t.userName=:userName where t.userId=:userId ")
  @Modifying
  @Transactional
  public void updateUserName(@Param("userName") String userName,@Param("userId") String userId);




}
