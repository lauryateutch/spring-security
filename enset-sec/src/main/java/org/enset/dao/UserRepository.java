package org.enset.dao;

import org.enset.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserRepository extends JpaRepository<User, String> {
}
