package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 用户Mapper
 *
 * @Auther wh
 * @Date 2022/11/10 19:01
 */
@Mapper
public interface UserMapper {

    @Select("select * from DB_USER where uid = #{uid}")
    User getUserById(int uid);
}
