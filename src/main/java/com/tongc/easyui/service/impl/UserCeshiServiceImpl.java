package com.tongc.easyui.service.impl;

import com.qiyuesuo.pdf.text.T;
import com.tongc.easyui.dao.UserCeshiDao;
import com.tongc.easyui.dto.Vo.UserCeshiVo;
import com.tongc.easyui.entity.UserCeshi;
import com.tongc.easyui.service.UserCeshiService;
import hans.common.persistence.ResponseVo;
import hans.common.persistence.service.CrudService;
import org.springframework.stereotype.Service;
import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.TxTransaction;

import javax.annotation.Resource;

/**
 * Service
 *
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Service
@TxTransaction(propagation = DTXPropagation.SUPPORTS)
public class UserCeshiServiceImpl extends CrudService<UserCeshiDao, UserCeshi, UserCeshiVo> implements UserCeshiService {

    @Resource
    UserCeshiDao userCeshiDao;


    @Override
    public ResponseVo<T> getList(String id) {
        System.out.println("??????????????????????????????????????");
        UserCeshiVo list = userCeshiDao.getList(id);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        return  new ResponseVo().ok(list);
    }


}
