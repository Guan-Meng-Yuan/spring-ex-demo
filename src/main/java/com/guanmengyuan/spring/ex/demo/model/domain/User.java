package com.guanmengyuan.spring.ex.demo.model.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guanmengyuan.spring.ex.common.model.domain.BaseDomain;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "`user`")
@Comment("用户")
@EqualsAndHashCode(callSuper = true)
@Data(staticConstructor = "create")
@Accessors(chain = true)
public class User extends BaseDomain<User> {
    public User() {
    }

    @Comment("用户名")
    private String account;
    @Comment("密码")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Comment("昵称")
    private String nickname;
}
