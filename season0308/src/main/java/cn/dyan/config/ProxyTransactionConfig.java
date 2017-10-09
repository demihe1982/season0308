package cn.dyan.config;

import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;

//@Configuration
public class ProxyTransactionConfig {

    @Bean
    public AspectJExpressionPointcutAdvisor attributeSourceAdvisor(){
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setAdvice(interceptor());
        return advisor;
    }
    @Bean
    public NameMatchTransactionAttributeSource source(){
        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
        return source;
    }
    @Bean
    public TransactionInterceptor interceptor(){
        TransactionInterceptor interceptor = new TransactionInterceptor();
        interceptor.setTransactionAttributeSource(source());
        return interceptor;
    }
}
