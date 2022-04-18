-- 한줄 주석
/*
 여러줄 주석
*/

Create DataBase myDB;

-- 반드시 해당 DB에 use 구문을 사용해 접속한 다음 작업해야 한다.
use myDB;

Create Table abc (
	a int not null,
	b char(10) null,
	c varchar(50) null
);
select * from abc;
insert into abc values (1, '홍길동', 'aaa@aaa.com');

use world;
select * from city;

use sys;

use sakila;