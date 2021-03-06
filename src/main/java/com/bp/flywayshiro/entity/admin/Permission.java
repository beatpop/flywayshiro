package com.bp.flywayshiro.entity.admin;

import com.bp.flywayshiro.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 权限
 * @author DH
 */
@Entity
@Table(name = "permission")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Permission extends BaseEntity implements Serializable {
    /**
     * 权限名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 描述
     */
    @Column(name = "`description`")
    private String description;

    /**
     * 角色列表
     */
    @ManyToMany(targetEntity = Role.class, cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "role_permission", joinColumns = @JoinColumn(name = "permission_id", columnDefinition = "permission_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", columnDefinition = "role_id"))
    @JsonIgnoreProperties({"permissions", "users"})
    private List<Role> roles = new ArrayList<>();
}
