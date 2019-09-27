package com.tongc.easyui.entity;

import hans.common.persistence.entity.DataEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
/**
 * Entity
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Getter
@Setter
@NoArgsConstructor
public class UserCeshi extends DataEntity<UserCeshi> {

    private static final long serialVersionUID = 1L;

    /** 名字 */
    private String name = "";

    public UserCeshi(String id) {
        super(id);
    }

}
