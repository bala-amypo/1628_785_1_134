package com.example.demo.PatientProfile;

public class PatientProfile{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Long id;
      private String patientId;
      private String email;
      private String password;
      private Date createAt;

}