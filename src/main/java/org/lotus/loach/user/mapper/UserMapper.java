package org.lotus.loach.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.lotus.loach.user.entity.User;

/**
 * 用户mapper
 *
 * @author: Foy Lian
 * Date: 6/4/2019
 * Time: 5:56 PM
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
