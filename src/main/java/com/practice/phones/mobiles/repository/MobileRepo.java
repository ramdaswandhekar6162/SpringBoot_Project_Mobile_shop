package com.practice.phones.mobiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.phones.mobiles.entity.MobileData;

@Repository
public interface MobileRepo extends JpaRepository<MobileData, Long> {

}
