package com.bp.flywayshiro.dao.admin;

import com.bp.flywayshiro.entity.admin.Role;
import com.bp.flywayshiro.entity.admin.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * UserDAO
 * @author DH
 */
public interface UserRepository extends CrudRepository<User, Long> {
    /**
     * 根据用户名查找用户
     * @param username 用户名
     * @return User
     */
    public User findByUsername(String username);
}
