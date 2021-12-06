create database `todo_employe`;
use `todo_employe`;
create table Personnel (matle int primary key auto_increment, prenom varchar(20), nom varchar(20),sexe enum('f','m'),adresse varchar(30),pays varchar(30));