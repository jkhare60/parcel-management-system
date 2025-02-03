package com.application.parcel.parcelsrvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.parcel.parcelsrvc.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Long>{

}
