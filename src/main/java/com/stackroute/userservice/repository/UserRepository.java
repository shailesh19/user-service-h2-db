package com.stackroute.userservice.repository;

import com.stackroute.userservice.domain.User;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.*;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
}
