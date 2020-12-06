package com.pengheng.mapper;

import com.pengheng.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author pengheng
 * @Date 2020/12/6 1:25
 * @Remark
 */
@Component
public interface AccountMapper {

    //定义Dao层接口方法 --> 查询account表所有数据
    List<Account> queryAccountList();
}
