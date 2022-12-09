package com.example.springopenapirest.controller;

import com.example.springopenapirest.service.UserService;
import com.example.web.controller.UserApi;
import com.example.web.dto.FindUserRequest;
import com.example.web.dto.UserCreateRequest;
import com.example.web.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor //констр для всех финальных полей
public class UserController implements UserApi {

    private final UserService userService;


    @Override
    public ResponseEntity<UserResponse> createUser(UserCreateRequest userCreateRequest) {
        UserResponse response = userService.createUser(userCreateRequest);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<List<UserResponse>> findUsers(FindUserRequest userParams) {
        List<UserResponse> userResponse= userService.findUser(userParams);
        if(userResponse.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(userResponse);
    }
}
