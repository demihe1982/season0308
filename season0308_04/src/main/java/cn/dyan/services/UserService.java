package cn.dyan.services;

import cn.dyan.domain.TbUser;
import cn.dyan.mapping.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private TbUserMapper userMapper;

    public List<TbUser> getAll(){
        return  userMapper.selectAll();
    }

    public int saveUser(TbUser user){
        return userMapper.insert(user);
    }
}
