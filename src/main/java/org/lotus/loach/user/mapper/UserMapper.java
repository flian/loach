package org.lotus.loach.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.lotus.loach.user.entity.User;

import java.util.List;

/**
 * 用户mapper
 *
 * @author: Foy Lian
 * Date: 6/4/2019
 * Time: 5:56 PM
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> selectByNameAndAge(@Param("name") String name, @Param("age") Integer age);

    @Select("select * from USER  where name=#{name}")
    List<User> selectByName(String name);

    Page<User> pageList(Page page, @Param("name")String name);
}
