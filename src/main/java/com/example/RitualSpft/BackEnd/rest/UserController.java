package com.example.RitualSpft.BackEnd.rest;

import com.example.RitualSpft.BackEnd.models.dto.UserDto;
import com.example.RitualSpft.BackEnd.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    final UserServiceImpl service;

    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/save")
    public UserDto create (@RequestBody UserDto userDto){
        return service.create(userDto);
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){
        service.delete(id);

    }

    @GetMapping("/all")
    public List<UserDto> getAll(){
        return service.getAll();
    }

    @PutMapping("/edit")
    public UserDto edit (@RequestBody UserDto userDto){
        return service.edit(userDto);
    }

    @GetMapping("{id}")
    public List<UserDto>getOne(@PathVariable Long id){
        return service.findById(id);
    }
}
