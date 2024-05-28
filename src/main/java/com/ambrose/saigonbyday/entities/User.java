package com.ambrose.saigonbyday.entities;

import com.ambrose.saigonbyday.entities.enums.Gender;
import com.ambrose.saigonbyday.entities.enums.Role;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String fullname;
  private String login;
  private String address;
  private String email;
  private String password;
  private String phone;
  private Gender gender;
  private Role role;
  private String DOB;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Order> orders;
}