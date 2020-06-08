package com.Nalini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nalini.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, String>
{



}
