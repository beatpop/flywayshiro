package com.bp.flywayshiro.service.admin;

import com.bp.flywayshiro.dao.admin.PermissionRepository;
import com.bp.flywayshiro.entity.admin.Permission;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限Service
 *
 * @author DH
 */
@Slf4j
@Service
public class PermissionService {

    @Resource
    private PermissionRepository permissionRepository;

    /**
     * 根据id查找权限
     *
     * @param id
     * @return
     */
    public Permission findById(Long id) {
        return permissionRepository.findById(id).orElse(null);
    }

    /**
     * 查询所有权限列表
     *
     * @return
     */
    public Iterable<Permission> findAll() {
        return permissionRepository.findAll();
    }

    /**
     * 根据角色id查找权限列表
     *
     * @param roleId
     * @return
     */
    public List<Permission> findAllByRoleId(Long roleId) {
        log.info("findAllByRoleId: roleId-{}", roleId);
        return permissionRepository.findAllByRoleId(roleId);
    }
}
