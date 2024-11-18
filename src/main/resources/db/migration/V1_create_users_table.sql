create schema if not exists users;

create table users.user(
    id bigserial primary key,
    nome varchar (250) not null,
    cpf varchar(250) not null,
    end varchar (250) not null,
    email varchar(250) not null,
    tel varchar (250) not null,
    dtcadastro timestamp not null;
);