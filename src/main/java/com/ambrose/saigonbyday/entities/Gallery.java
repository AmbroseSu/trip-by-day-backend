package com.ambrose.saigonbyday.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_gallery")
public class Gallery {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(length = 20000)
  private String imageNo1;
  @Column(length = 20000)
  private String imageNo2;
  @Column(length = 20000)
  private String imageNo3;
  private Boolean status;

  @OneToOne(mappedBy = "gallery", cascade = CascadeType.ALL)
  private Destination destination;
}
