-- 한줄 주석
/*
여러줄 주석
*/


Create Database myDB;		-- myDB 생성

use myDB;					-- myDB에 연결

Create Table abc(			-- Table 생성
	a int not null,
	b char(10) null,
	c varchar(50) null
	);

select * from abc;			-- Table 내용 출력

insert into abc values(1, '홍길동', 'aaa@aaa.com');		-- Table에 값 삽입
insert into abc values(2, '김유신', 'bbb@bbb.com');

select * from abc;