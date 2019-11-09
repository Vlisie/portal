create table if not exists Users
(ID BIGINT(20) not null auto_increment primary key, FirstName varchar(40) not null, LastName varchar(40) not null, UserName varchar(20) not null unique);
