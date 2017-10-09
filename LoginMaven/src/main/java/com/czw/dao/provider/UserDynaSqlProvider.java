package com.czw.dao.provider;

import com.czw.domain.User;
import org.apache.ibatis.jdbc.SQL;

public class UserDynaSqlProvider {

    public String insertUser(final User user){
        return new SQL(){
            {
                INSERT_INTO("login");
                if(user.getLoginname()!=null&&!user.getLoginname().equals("")){
                    VALUES("loginname","#{loginname}");
                }
                if(user.getPassword()!=null&&!user.getPassword().equals("")){
                    VALUES("password","#{password}");
                }
            }
        }.toString();
    }

}
