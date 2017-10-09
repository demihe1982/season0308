package cn.dyan.services;

import cn.dyan.domain.TbUser;
import cn.dyan.mapping.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private TbUserMapper userMapper;

    public List<TbUser> getAll(){
        return  userMapper.selectAll();
    }

    public int saveUser(TbUser user){
        return userMapper.insert(user);
    }
    
    public int createUser(TbUser user){
        TransactionTemplate transactionTemplate = new TransactionTemplate(this.transactionManager);
        return transactionTemplate.execute(new TransactionCallback<Integer>() {
            @Override
            public Integer doInTransaction(TransactionStatus status) {
                return userMapper.insert(user);
            }
        });
    }
}
