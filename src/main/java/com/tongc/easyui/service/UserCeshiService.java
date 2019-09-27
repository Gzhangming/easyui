package com.tongc.easyui.service;

import com.qiyuesuo.pdf.text.T;
import com.tongc.easyui.entity.UserCeshi;
import hans.common.persistence.ResponseVo;
import hans.common.persistence.service.IBaseService;
/**
 * Service
 *
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
public interface UserCeshiService extends IBaseService<UserCeshi> {



    ResponseVo<T>  getList(String id);


}
