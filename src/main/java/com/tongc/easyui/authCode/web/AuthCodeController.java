package com.tongc.easyui.authCode.web;//
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                           O\  =  /O
//                        ____/`---'\____
//                      .'  \\|     |//  `.
//                     /  \\|||  :  |||//  \
//                    /  _||||| -:- |||||-  \
//                    |   | \\\  -  /// |   |
//                    | \_|  ''\---/''  |   |
//                    \  .-\__  `-`  ___/-. /
//                  ___`. .'  /--.--\  `. . __
//               ."" '<  `.___\_<|>_/___.'  >'"".
//              | | :  `- \`.;`\ _ /`;.`/ - ` : | |
//              \  \ `-.   \_ __\ /__ _/   .-` /  /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//                      佛祖保佑       永无BUG

import com.tongc.easyui.authCode.dto.R;
import com.tongc.easyui.authCode.dto.SendCodeArg;
import hans.common.persistence.web.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-25 14:09
 * @Description: 验证码发送学习
 **/
@RestController
@Slf4j
@Api(tags = "鉴权中心", description = "鉴权中心", produces= MediaType.APPLICATION_JSON_VALUE)
public class AuthCodeController extends BaseController {
    
    /**
    * @Description: 发送短信验证码
    * @url: 
    * @Param: 
    * @return: 
    * @Author: zhang.jiaming
    * @Date: 2019/10/25
    */
    @PostMapping ("/auth/sendCode")
    @ApiOperation(value = "获取验证码",httpMethod = POST,notes = auth_yes)
    public R sendCode(@RequestBody SendCodeArg sendCodeArg){
        if (StringUtils.isBlank(sendCodeArg.getUsername())){
            return R.error("手机号不能为空！！！");
        }
        //生成随机验证码
        String code = RandomStringUtils.randomNumeric(4);


        return null;
    }

}
