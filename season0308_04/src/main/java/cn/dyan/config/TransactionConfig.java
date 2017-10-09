package cn.dyan.config;

import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration;
import org.springframework.transaction.config.TransactionManagementConfigUtils;
import org.springframework.transaction.interceptor.*;

@Configuration
public class TransactionConfig extends AbstractTransactionManagementConfiguration{

    @Bean(name= TransactionManagementConfigUtils.TRANSACTION_ADVISOR_BEAN_NAME)
    public AspectJExpressionPointcutAdvisor aspectJExpressionPointcutAdvisor(){
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression("execution(* cn.dyan.services.*.*(..))");
        advisor.setAdvice(interceptor());
        return advisor;
    }

    @Bean
    public TransactionAttributeSource transactionAttributeSource(){
        NameMatchTransactionAttributeSource nameMatchTransactionAttributeSource = new NameMatchTransactionAttributeSource();
        RuleBasedTransactionAttribute transactionAttribute = new RuleBasedTransactionAttribute();
        transactionAttribute.setIsolationLevel(TransactionDefinition.ISOLATION_SERIALIZABLE);
        transactionAttribute.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        nameMatchTransactionAttributeSource.addTransactionalMethod("save*",transactionAttribute);
        transactionAttribute = new RuleBasedTransactionAttribute();
        transactionAttribute.setReadOnly(true);
        nameMatchTransactionAttributeSource.addTransactionalMethod("get*",transactionAttribute);
        nameMatchTransactionAttributeSource.addTransactionalMethod("*",new DefaultTransactionAttribute());
        return nameMatchTransactionAttributeSource;
    }

    @Bean
    public TransactionInterceptor interceptor(){
        TransactionInterceptor interceptor = new TransactionInterceptor();
        interceptor.setTransactionAttributeSource(transactionAttributeSource());
        if(this.txManager !=null){
            interceptor.setTransactionManager(this.txManager);
        }
        return interceptor;
    }



}
