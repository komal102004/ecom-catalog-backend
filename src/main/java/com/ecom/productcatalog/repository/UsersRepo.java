package com.ecom.productcatalog.repository;


import com.ecom.productcatalog.model.Users;  // ✅ Correct Import

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepo extends JpaRepository<Users,String> {

    Optional<Users> findByEmail(String email);
}
