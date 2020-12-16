use jspservletjdbc;

insert into roles(code,name) values('ADMIN','ADMIN');
insert into roles(code,name) values('USER','USER');

insert into users(username,password,fullname,status, roleid) values('admin','123456','admin',1,1);
insert into users(username,password,fullname,status, roleid) values('nguyenvana','123456','nguyen van a',1,2);
insert into users(username,password,fullname,status, roleid) values('nguyenvanb','123456','nguyen van b',1,2);

insert into category(code, name) values ('the-thao', N'Thể thao')
insert into category(code, name) values ('the-gioi', N'Thế giới')
insert into category(code, name) values ('chinh-tri', N'Chính trị')
insert into category(code, name) values ('thoi-su', N'Thời sự')
insert into category(code, name) values ('goc-nhin', N'Góc nhìn')

select * from category

insert into news(title, categoryId) values ('bài viết 1', 1);
insert into news(title, categoryId) values ('bài viết 2', 1);
insert into news(title, categoryId) values ('bài viết 3', 2);

select * from roles
select * from users
select * from category
select * from comment

select * from news

delete news where id = 12

Update news set title = NULL where id = 12
