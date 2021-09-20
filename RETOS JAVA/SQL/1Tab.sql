/*crear la base de datos*/
create database BaseDatosProductos;
/*Seleccionar base de datos*/
use BaseDatosProductos;
/*Crear tabla*/
CREATE TABLE listaProductos(codigo int(10)not null, nombre varchar(30) not null, precio double(12,2) NOT NULL, inventario int(30) not null);
/*consultar contenido de la tabla */
select * from listaProductos;
/*Ingreso de registros*/
INSERT INTO listaProductos values(1,"Naranjas",7000.00,35);
INSERT INTO listaProductos values(2,"Limones",2500.00,15);
INSERT INTO listaProductos values(3,"Peras",2700.0,65);
INSERT INTO listaProductos values(4,"Arandanos",9300.0,34);
INSERT INTO listaProductos values(5,"Tomates",2100.0,42);
INSERT INTO listaProductos values(6,"Fresas",9100.0,20);
INSERT INTO listaProductos values(7,"Helado",4500.0,41);
INSERT INTO listaProductos values(8,"Galletas",500.0,8);
INSERT INTO listaProductos values(9,"Chocolates",4500.0,80);
INSERT INTO listaProductos values(10,"Jamon",17000.0,48);
/*seleccionar campos*/
Select nombre, inventario from listaproductos;
/*actualizar registro*/
update listaproductos set inventario = 36
where codigo = 1;
/*adicionar campos a una tabla*/
alter table listaproductos add(valorCompras decimal(20,20));
/*Seleccionar una columna calculada*/
select codigo, precio, precio/10 as Descuento from listaproductos;
/*Actualizar todos los registros con formulas*/
update listaproductos set valorCompras = precio*35;

select codigo, nombre from listaproductos
	/*seleccionar si tiene un caracter en especial AND u OR*/
    /*where nombre like '%U%' or nombre like '%A%';*/
	/*ordenar columnas ASC O DESC*/
	order by nombre asc;

/*CREAR LLAVE PRIMARIA*/
ALTER table listaproductos add primary key(codigo);

/*sumar el total de las columnas*/
select sum(precio) as valorTotal from listaproductos;
/*sacar el promedio de las columnas*/
select avg(precio) as promedioTotal from listaproductos;
/*eliminar registros*/
delete from listaproductos
where nombre like '%f%';