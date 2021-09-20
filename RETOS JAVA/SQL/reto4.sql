/*Crear tabla*/
CREATE TABLE productos(codigo int(10)not null, nombre varchar(25) not null, precio double(12,2) NOT NULL, inventario int(30) not null);
/*Seleccionar base de datos*/
use reto4;
/*agregamos todo los productos a la tabla*/
INSERT INTO productos values(1,"Naranjas",7000.00,35);
INSERT INTO productos values(2,"Limones",2500.00,15);
INSERT INTO productos values(3,"Peras",2700.0,65);
INSERT INTO productos values(4,"Arandanos",9300.0,34);
INSERT INTO productos values(5,"Tomates",2100.0,42);
INSERT INTO productos values(6,"Fresas",9100.0,20);
INSERT INTO productos values(7,"Helado",4500.0,41);
INSERT INTO productos values(8,"Galletas",500.0,8);
INSERT INTO productos values(9,"Chocolates",4500.0,80);
INSERT INTO productos values(10,"Jamon",17000.0,48);
/*visualizamos la tabla*/
SELECT * FROM reto4.productos;
/*CONSULTAS*/
SELECT nombre, inventario
FROM productos
where precio>=9200
ORDER BY nombre ASC;
/*CONSULTAR TODA LA TABLA*/
SELECT * from productos;