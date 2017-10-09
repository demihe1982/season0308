DROP TABLE IF EXISTS tb_user;
CREATE TABLE tb_user(
    username varchar(20) NOT NULL,
    password varchar(20) NOT NULL,
    PRIMARY KEY(username)
);

DROP TABLE IF EXISTS tb_menu;
CREATE TABLE tb_menu(
    menu_id varchar(20) NOT NULL,
    menu_name varchar(50) NOT NULL,
    url varchar(100),
    ord tinyint(4) NOT NULL DEFAULT 0,
    PRIMARY KEY(menu_id)
);

DROP TABLE IF EXISTS tb_user_menu;
CREATE TABLE tb_user_menu(
    user_id varchar(20) NOT NULL,
    menu_id varchar(20) NOT NULL,
    PRIMARY KEY (user_id,menu_id)
);

DROP TABLE IF EXISTS tb_order;
CREATE TABLE tb_order(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    seller varchar(20),
    buyer varchar(20),
    amount float(10,2),
    status tinyint(1) NOT NULL DEFAULT 0,
    created timestamp NOT NULL DEFAULT now(),
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS tb_order_log;
CREATE TABLE tb_order_log(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    seller varchar(20),
    buyer varchar(20),
    created date,
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS tb_email;
CREATE TABLE tb_email(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    seller varchar(20),
    subject varchar(100),
    created date,
    PRIMARY KEY(id)
);

insert into tb_user values('admin','12345');
insert into tb_user values('dyan','12345');

insert into tb_menu values('1001','user management','/user',1);
insert into tb_menu values('1002','order management','/order',2);






