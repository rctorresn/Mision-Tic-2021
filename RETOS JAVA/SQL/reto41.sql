/*CONSULTAS*/
SELECT nombre, inventario
FROM productos
where precio>=9200
ORDER BY nombre ASC;
/*OBTENER PROMEDIO*/
SELECT AVG(precio) as promedio
FROM productos;
/*OBTENER NOMBRE Y PRECIO*/
SELECT nombre, precio
FROM productos
WHERE nombre LIKE "A%" OR nombre LIKE "P%"
ORDER BY nombre ASC;
/*OBTENER NUMERO TOTAL DE PRODUCTOS*/
SELECT count(precio) AS total
FROM productos
WHERE precio >= 3000 AND precio <= 10000;
/*OBTENER EL VALOR TOTAL DEL INVENTARIO*/
SELECT sum(precio*inventario) AS total_inventario
FROM productos;


