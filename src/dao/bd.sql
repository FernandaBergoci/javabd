create database bd_java;

use bd_java;

create table `user`(
 `id` int not null auto_increment,
`nome` varchar(80) not null,
`email` varchar(40) not null,
`password` varchar(20) not null,
	primary key (`id`)
);

select * from user;