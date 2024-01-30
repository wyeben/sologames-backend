package com.sologamesbackend.sologamesbackend.servises;

import com.sologamesbackend.sologamesbackend.dto.request.UserRequest;
import com.sologamesbackend.sologamesbackend.dto.response.UserResponse;
import com.sologamesbackend.sologamesbackend.models.User;
import com.sologamesbackend.sologamesbackend.repositories.UserRepository.UserRepositoryImplementation;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Transactional
    public UserResponse saveUser(UserRequest userRequest){
        User user = new User();
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setPassword(userRequest.getPassword());
        UserRepositoryImplementation userRepositoryImplementation = new UserRepositoryImplementation();
        userRepositoryImplementation.save(user);
        UserResponse userResponse = new UserResponse();
        userResponse.setMessage("Saved successfully");
        return userResponse;
    }
}
