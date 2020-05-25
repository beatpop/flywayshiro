package com.bp.flywayshiro.service.admin;

import com.bp.flywayshiro.dao.admin.RoleRepository;
import com.bp.flywayshiro.entity.admin.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色Service
 *
 * @author DH
 */
@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;

    /**
     * 根据id查找角色
     *
     * @param id 角色id
     * @return
     */
    public Role findById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    /**
     * 查找所有的角色
     *
     * @return
     */
    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    /**
     * 根据userId查询所有角色
     *
     * @param userId 用户id
     * @return
     */
    public List<Role> findAllByUserId(Long userId) {
        return roleRepository.findAllByUserId(userId);
    }

    /**
     * 创建角色
     * @param role
     * @return
     */
    public Role createRole(Role role) {
        if (role != null) {
            Role newRole = new Role();
            newRole.setName(role.getName());
            newRole.setDescription(role.getDescription());
            newRole.setPermissions(role.getPermissions());
            roleRepository.save(newRole);
            return newRole;
        }

        return null;
    }

    /**
     * 根据id删除角色
     *
     * @param id
     */
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
