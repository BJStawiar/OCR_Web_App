package com.highhawk.ocr_system.dto;

import lombok.Data;

public class UserDTO {
    private String email;
    private String password;

    public UserDTO() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
