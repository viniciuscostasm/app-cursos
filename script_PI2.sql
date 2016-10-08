create database bd_mobacad;
use bd_mobacad;
create table curso(
curso_id int auto_increment,
curso_nome varchar(200), 
curso_turno varchar(20),
curso_descricao varchar(500), 
curso_modalidade varchar(60), 
curso_avaliacao_mec int, 
curso_coordenador varchar(200), 
curso_duracao varchar(200), 
curso_mensalidade decimal(15,2),
curso_status varchar(50),
curso_categoria varchar(100),
primary key(curso_id));

create table elemento(
elemento_id int auto_increment,
elemento_titulo varchar(200),
elemento_descricao varchar(1000),
elemento_caminhoarqpdf varchar(1000),
elemento_curso_id int,
primary key(elemento_id),
foreign key(elemento_curso_id) references curso(curso_id));

create table subelemento(
subelemento_id int auto_increment,
subelemento_titulo varchar(200),
subelemento_descricao varchar(1000),
subelemento_caminhoarqpdf varchar(1000),
subelemento_elemento_id int,
primary key(subelemento_id),
foreign key(subelemento_elemento_id) references elemento(elemento_id));
