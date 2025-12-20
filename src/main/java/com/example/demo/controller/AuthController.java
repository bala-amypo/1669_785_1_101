// package com.example.demo.controller;

// import io.swagger.v3.oas.annotations.tags.Tag;
// import com.example.demo.service.WarehouseService;
// import com.example.demo.model.Warehouse;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.Record;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PathVariable;


// @RestController
// @RequestMapping("/auth")
// @Tag(name = "Authentication")
// public class AuthController {


// private final UserService userService;


// public AuthController(UserService userService) {
// this.userService = userService;
// }


//  @PostMapping("/register")
//  public User register(@RequestBody UserRegisterDto dto) {
//  return userService.register(dto);
//  }


// @PostMapping("/login")
// public AuthResponse login(@RequestBody AuthRequest request) {
// return userService.login(request);
// }
// }