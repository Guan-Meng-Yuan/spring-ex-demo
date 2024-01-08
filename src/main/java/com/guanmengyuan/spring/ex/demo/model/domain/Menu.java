package com.guanmengyuan.spring.ex.demo.model.domain;

import com.guanmengyuan.spring.ex.common.model.domain.BaseDomain;
import com.mybatisflex.annotation.RelationOneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain = true)
@Data(staticConstructor = "create")
@EqualsAndHashCode(callSuper = true)
public class Menu extends BaseDomain<Menu> {

    /**
     * 路径
     */
    private String path;
    /**
     * 父路由id
     * 
     */
    private String parentId;

    /**
     * 组件名称
     */
    private String component;

    /**
     * 路由名称
     */
    private String name;

    /**
     * 路由图标
     */
    private String icon;
    /**
     * 菜单类型
     */
    private Integer type;
    /**
     * 是否隐藏
     */
    private  Boolean hidden;
    /**
     * 路由标题
     */
    private String title;
    /**
     * 子路由
     */
    @RelationOneToMany(selfField = "id", targetField = "parentId")
    private List<Menu> children;

}