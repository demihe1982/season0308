package cn.dyan.services;

import cn.dyan.domain.UserMenu;
import cn.dyan.mapping.UserMenuMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Component
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private UserMenuMapper userMenuMapper;
    /**
     * 授权
     * @param username
     * @param userMenuList
     */
    @Transactional
    public void  authorize(String username,List<UserMenu> userMenuList) throws SQLException {
        deleteAllAuthorization(username);
        userMenuList.stream().forEach(userMenu -> userMenuMapper.insert(userMenu));
    }

    @Transactional
   public void deleteAllAuthorization(String username) throws SQLException {
        Connection cnn = SqlSessionUtils.getSqlSession(sqlSessionFactory).getConnection();
        LOGGER.debug("get Connection [{}]",cnn);
        Statement statement = null;
        try {
            statement = cnn.createStatement();
            statement.execute("DELETE FROM tb_user_menu WHERE  user_id='" + username + "'");
        }finally {
            JdbcUtils.closeStatement(statement);
        }
    }

}
