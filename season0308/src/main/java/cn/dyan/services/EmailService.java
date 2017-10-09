package cn.dyan.services;

import cn.dyan.domain.Email;
import cn.dyan.mapping.EmailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class EmailService {

    @Autowired
    private EmailMapper emailMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void sendEmail(String seller,String subject){
        Email email = new Email();
        email.setSeller(seller);
        email.setSubject(subject);
        email.setCreated(new Date());
        emailMapper.insert(email);
    }
}
