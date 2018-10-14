package com.yanghao.respository;

import com.yanghao.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/*2018/10/14 0014
   杨浩*/
@Repository
public interface IUserRespository {

    //@Select("select * from user")
    List<User> findAll() throws Exception;
}
