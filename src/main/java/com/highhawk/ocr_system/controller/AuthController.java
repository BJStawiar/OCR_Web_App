package com.highhawk.ocr_system.controller;

import com.highhawk.ocr_system.dto.UserDTO;
import com.highhawk.ocr_system.model.User;
import com.highhawk.ocr_system.security.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserDTO userDTO) {
        User user = authService.register(userDTO);
        return ResponseEntity.ok(user);
    }
}