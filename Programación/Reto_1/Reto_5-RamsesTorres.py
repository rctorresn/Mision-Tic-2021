productos = {
    "codigo":1,
    "nombre":"Manzanas",
    "precio":9000,
    "inventario":65
}

CantidadProductos = int(input())    
for i in range(CantidadProductos):
    codigo = int(input("codigo"))
    producto = str(input("producto"))
    precio = int(input("precio"))
    cantidad = int(input("cantidad"))

    nuevoProducto = {}
    nuevoProducto["Cod"]=codigo
    nuevoProducto["Producto"]=producto
    nuevoProducto["Precio"]=precio
    nuevoProducto["Cantidad"]=cantidad

    productos.append(nuevoProducto) 
    print(productos)


    






    
    

