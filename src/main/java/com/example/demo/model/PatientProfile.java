package com.example.demo.PatientProfile;

public class PatientProfile{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Long id;
      @Column(unique=true)
      private String patientId;
      private String email;
      private String password;
      private Date createAt;

}