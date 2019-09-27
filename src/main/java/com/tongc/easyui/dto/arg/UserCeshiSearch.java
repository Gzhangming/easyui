package com.tongc.easyui.dto.arg;


import com.tongc.easyui.entity.UserCeshi;
import hans.common.persistence.dto.BasePageDto;
import lombok.Getter;
import lombok.Setter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;
/**
 * Search
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Getter
@Setter
@ApiModel(value = "UserCeshiSearch")
public class UserCeshiSearch extends BasePageDto {

    private static final long serialVersionUID = 1L;

    /** 名字 */
    @ApiModelProperty(value = "名字")
    private String name = "";

    public UserCeshi toUserCeshi() {
        UserCeshi userCeshi = new UserCeshi();
        BeanUtils.copyProperties(this, userCeshi);
        return userCeshi;
    }

}
