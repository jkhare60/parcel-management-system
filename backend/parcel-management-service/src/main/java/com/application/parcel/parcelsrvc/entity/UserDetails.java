package com.application.parcel.parcelsrvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
@ToString
public class UserDetails {
    @Id
    private long user_id;
    private String name;
    private String email;
    private long number;
    private String address;
    private String password;
    private boolean officer;
}
