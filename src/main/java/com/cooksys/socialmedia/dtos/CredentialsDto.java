package com.cooksys.socialmedia.dtos;

import lombok.NonNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CredentialsDto {

    @NonNull
    private String email;
    
    @NonNull
    private String password;
}
