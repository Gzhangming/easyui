package com.tongc.easyui.dao;

import com.tongc.easyui.dto.Vo.UserCeshiVo;
import com.tongc.easyui.entity.UserCeshi;
import hans.common.persistence.dao.CrudDao;
import org.apache.ibatis.annotations.Mapper;
/**
 * Dao
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@Mapper
public interface UserCeshiDao extends CrudDao<UserCeshi> {

    UserCeshiVo getList(String id);

}
