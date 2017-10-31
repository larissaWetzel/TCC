package tcc;

import tcc.telas.Principal;

public class Administrador {

    public static void main(String[] args) {

        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        /*
         create schema loja_vanetex;
         use loja_vanetex;


         create table cliente
         (
         codCliente int auto_increment primary key,
         nomeCliente varchar(60) not null,
         foneCliente varchar(13) not null,
         celularCliente varchar(14) not null,
         emailCliente varchar(100) not null,
         enderecoCliente varchar(100) not null
         );


         create table administrador
         (
         nomeAdm varchar(100) primary key,
         senhaAdm varchar(20) not null
         );
         insert into administrador (nomeAdm, senhaAdm) values ('lari', '123');

         insert into administrador values 
         ('zoboli', '123'),
         ('Vanessa','123'),
         ('vania','123'),
         ('maria','123');

         create table produto
         (
         codProd int auto_increment primary key,
         precoProd float not null,
         nomeProd varchar(50) not null,
         qntProd int not null
   
         );
         alter table produto add column tamProd enum ('P', 'M', 'G') not null;
         select codProd from produto where exists (select codProd);
    
         truncate table produto;
 
         select * from cliente;
         select * from produto;
         select * from administrador;

         */
    }
}
