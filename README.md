# prueba-3

create database prueba3;

use prueba3;

create table Ciudades(
ciudad_id int(10) auto_increment primary key not null,
nombre varchar(100),
pais_id int(10),
estado varchar(100));

create table Establecimientos(
establecimiento_id int(10) auto_increment primary key not null,
nombre varchar(100),
fecha_creacion DATE,
ciudad_id int(10),
estado varchar(100),
creado_por varchar(100));

create table Paises(
pais_id int(10) auto_increment primary key not null,
nombre varchar(100),
estado varchar(16));

create table Usuarios(
usuario_id int(10) auto_increment primary key not null,
usuario varchar(100),
clave varchar(100),
fecha_nacimiento DATE,
estado varchar(10));
