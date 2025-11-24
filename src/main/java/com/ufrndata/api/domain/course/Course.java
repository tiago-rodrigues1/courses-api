package com.ufrndata.api.domain.course;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "course")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
  @Id
  @GeneratedValue
  private UUID id;

  @Column(unique = true)
  private String code;
  
  private String name;
  private int workload;
  private int originalPeriod;
  private String major;
  private boolean mandatoryToMajor;
  private String type;
}
