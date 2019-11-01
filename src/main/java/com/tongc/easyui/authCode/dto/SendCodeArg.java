package com.tongc.easyui.authCode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @description: 发送短信验证码参数
 * @author: WangSai
 * @create: 2019-07-02 17:27
 */
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
@ApiModel(value = "SendCodeArg")
public class SendCodeArg {
    @ApiModelProperty(value = "手机号")
    private String username;
    /** 业务类型 */
    @ApiModelProperty(value = "业务类型   1= 登录短信，2=注册短信，3=发送账单短信，4=获取门锁密码，5=预定房间短信，6=房源预定成功，7=签约成功，8合同到期，9=房租到期，10=水费预警，11=电费预警，12=房租催缴，13=发票申请成功，14=车位申请成功，15=换房成功，16=退房成功， 17=修改密码， 18=身份验证验证码")
    private int type;
}
