一、注解事务+Mybatis+JDBC原生访问数据库结合的例子，要求JDBC参与到已有事务中
1.用户权限管理
  1.1 tb_user,tb_menu,tb_user_menu
  1.2 授权,先删除用户下的菜单授权,再新增用户权限.

 二、给出最适合requireNew与nested两种事务的使用场景案例
 2.新增工单
  2.1 tb_order,tb_send_email,tb_order_log
  2.2 新增工单,事务级别Require_New(sendEmail) , Nest(addLog)

 三.下面的业务方法，如何重构，从而实现进行事务性能方面的优化，
      MyServiceA
       {
        public void dobusiness()
                  {
                        queryLargRecords();
                        calcData();
                        updateMatchedRecords();
                  }
       }
---------analyze
3.1 big transaction?
  3.1.1 让queryLargRecords 设置queryLargRecords 事务为Require_New ,则不在同一个事务中。
  3.1.2 用(AopProxy.currentProxy()).xxxmethod的方式执行queryLargRecords


四、加分题，实现ＰＰＴ上的相关编程，即用注解方式完全替换ＸＭＬ的事务定义，给出例子
