package com.backend_app_hit.app_hit.dao;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Users")
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long id;

  @Nationalized
  @Column(name = "full_name", nullable = false)
  private String fullName;

  @Column(name = "user_name", nullable = false, unique = true)
  private String userName;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "birthday", nullable = false)
  private String birthday;

  @Column(name = "role")
  private String role;

  @Column(name = "phone", unique = true, nullable = false)
  private String phone;

  @Column(name = "email", unique = true, nullable = false)
  private String email;

  @Column(name = "point")
  private Long point;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JsonIgnore
  private List<UserClass> userClasses;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JsonIgnore
  private List<Post> posts;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JsonIgnore
  private List<Comment> comments;

  @CreationTimestamp
  private Timestamp createAt;

  @UpdateTimestamp
  private Timestamp updateAt;

  public User() {
  }

  public User(String fullName, String userName, String password, String birthday, String role, String phone,
      String email, Long point, List<UserClass> userClasses, List<Post> posts, List<Comment> comments) {
    this.fullName = fullName;
    this.userName = userName;
    this.password = password;
    this.birthday = birthday;
    this.role = role;
    this.phone = phone;
    this.email = email;
    this.point = point;
    this.userClasses = userClasses;
    this.posts = posts;
    this.comments = comments;
  }
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getPoint() {
    return point;
  }

  public void setPoint(Long point) {
    this.point = point;
  }

  public List<UserClass> getUserClasses() {
    return userClasses;
  }

  public void setUserClasses(List<UserClass> userClasses) {
    this.userClasses = userClasses;
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public Timestamp getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Timestamp createAt) {
    this.createAt = createAt;
  }

  public Timestamp getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Timestamp updateAt) {
    this.updateAt = updateAt;
  }

  
}
