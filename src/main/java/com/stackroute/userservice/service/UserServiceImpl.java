package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user)
    {
      User savedUser=userRepository.save(user);
      return savedUser;

    }

    @Override
    public User getUserById(int id)
    {
        User retievedUser = userRepository.findById(id).get();
        return retievedUser;
    }
}
