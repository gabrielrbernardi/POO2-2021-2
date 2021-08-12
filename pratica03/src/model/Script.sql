CREATE SCHEMA `poo`;

use poo;

create table Biblioteca (
	id int NOT NULL AUTO_INCREMENT,
    titulo varchar(255) not null,
    ano int not null,
    autor varchar(255),
    organizacao varchar(255),
    volume int,
    numero int,
    primary key (id)
);

select * from Biblioteca;