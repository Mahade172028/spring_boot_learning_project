package com.example.eurekagateway.controller;

import com.example.eurekagateway.model.AuthenticationRequest;
import com.example.eurekagateway.model.AuthenticationResponse;
import com.example.eurekagateway.service.MyUserDetailService;
import com.example.eurekagateway.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    MyUserDetailService userDetailService;

    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Security";
    }

    @PostMapping("/authentication")
    public AuthenticationResponse createTokenAuthentication(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword())
            );
        }catch (BadCredentialsException e){
          throw new Exception("Incorrect username and password",e);
        }
        final UserDetails userDetails = userDetailService.loadUserByUsername(authenticationRequest.getUsername());

        String jwt = jwtUtil.generateToken(userDetails);

        return new AuthenticationResponse(jwt) ;
    }

    @GetMapping("/user")
    public String userInfo(){
        return "Hello User";
    }

    @GetMapping("/admin")
    public String adminInfo(){
        return "Hello Admin";
    }
}
