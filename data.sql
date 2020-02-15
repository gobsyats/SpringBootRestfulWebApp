#Mobile Spring Boot Application SQL Queries

create database restcrudproduct;

select database();

use restcrudproduct;

create table product(
	id int(5) primary key auto_increment,
	name varchar(45) not null,
    price float not null);

select * from product;

show tables;

desc product;

insert into product (name, price) values ("Max3", 600);
insert into product (name, price) values ("S3", 1200);
insert into product (name, price) values ("Colorx", 600);
insert into product (name, price) values ("AriesL2", 2000);