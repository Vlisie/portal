create table if not exists Users
(ID BIGINT(20) not null auto_increment primary key, FirstName varchar(40) not null, LastName varchar(40) not null, UserName varchar(20) not null unique);
create table if not exists Accounts
(ID BIGINT(20) not null auto_increment primary key, Name varchar(40) not null, PlanLevel smallint not null);
create table if not exists Roles
(ID BIGINT(20) not null auto_increment primary key, Name varchar(40) not null, Description varchar(100) not null);
create table if not exists Memberships
(ID BIGINT(20) not null auto_increment primary key, UserID BIGINT(20) not null, constraint fk_membership_user foreign key (UserID) references Users(ID) on update cascade , AccountID BIGINT(20) not null, constraint fk_membership_account foreign key (AccountID) references Accounts(ID) on update cascade, RoleID BIGINT(20) not null, constraint fk_membership_role foreign key (RoleID) references Roles(ID));
create table if not exists Logins
(ID BIGINT(20) not null auto_increment primary key, UserName varchar(20) not null, constraint fk_login_user foreign key (UserName) references Users(UserName) on update cascade,Password varchar(20) not null);
