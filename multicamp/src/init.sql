drop table if exists student

create table student(
	name varchar(10),
	age int,
	score int
)

insert into student values('Hong',24,95)
insert into student values('Kim',22,75)
insert into student values('Lee',26,85)

select * from student;