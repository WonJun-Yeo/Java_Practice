-- ���� �ּ�
/*
������ �ּ�
*/


Create Database myDB;		-- myDB ����

use myDB;					-- myDB�� ����

Create Table abc(			-- Table ����
	a int not null,
	b char(10) null,
	c varchar(50) null
	);

select * from abc;			-- Table ���� ���

insert into abc values(1, 'ȫ�浿', 'aaa@aaa.com');		-- Table�� �� ����
insert into abc values(2, '������', 'bbb@bbb.com');

select * from abc;