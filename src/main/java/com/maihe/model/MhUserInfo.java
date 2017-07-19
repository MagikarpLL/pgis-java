package com.maihe.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MH_USER_INFO")
public class MhUserInfo {
  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(name = "USER_ID_", length = 36, nullable = false)
  private String userId;
  @Column(name = "USER_NAME_", length = 16)
  private String userName;
  @Column(name = "AGE_", length = 2)
  private Integer age;
  @Column(name = "BIRTHDAY_")
  private Date birthday;
  @Column(name = "SEX_", length = 1)
  private Integer sex;
  @Column(name = "ADDRESS_", length = 40)
  private String address;
  @Column(name = "PASSWORD_", length = 32)
  private String password;
  @Column(name = "EMAIL_", length = 32)
  private String email;
  @Column(name = "PHONE_NUMBER_", length = 11)
  private String phoneNumber;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "User{" +
      "userId='" + userId + '\'' +
      ", userName='" + userName + '\'' +
      ", age=" + age +
      ", birthday=" + birthday +
      ", sex=" + sex +
      ", address='" + address + '\'' +
      ", password='" + password + '\'' +
      ", email='" + email + '\'' +
      ", phoneNumber='" + phoneNumber + '\'' +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MhUserInfo user = (MhUserInfo) o;
    return Objects.equals(userId, user.userId) &&
      Objects.equals(userName, user.userName) &&
      Objects.equals(age, user.age) &&
      Objects.equals(birthday, user.birthday) &&
      Objects.equals(sex, user.sex) &&
      Objects.equals(address, user.address) &&
      Objects.equals(password, user.password) &&
      Objects.equals(email, user.email) &&
      Objects.equals(phoneNumber, user.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, age, birthday, sex, address, password, email, phoneNumber);
  }
}
