package com.tongc.easyui.dto.arg;

import javax.validation.constraints.NotBlank;

import com.tongc.easyui.entity.UserCeshi;
import org.hibernate.validator.constraints.Length;
import lombok.Getter;
import lombok.Setter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.BeanUtils;
/**
 * Insert
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "UserCeshiInsert")
public class UserCeshiInsert {

    private static final long serialVersionUID = 1L;

    /** 名字 */
    @ApiModelProperty(value = "名字")
    @NotBlank(message = "名字不能为空")
    @Length(max = 25, message = "名字长度不能大于25")
    private String name = "";

    public UserCeshi toUserCeshi() {
        UserCeshi userCeshi = new UserCeshi();
        BeanUtils.copyProperties(this, userCeshi);
        return userCeshi;
    }

}
