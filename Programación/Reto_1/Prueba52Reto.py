productos = dict({
    1:["Manzanas",9000,65],
    2:["Limones",2300,15],
    3:["Peras",2500,38],
    4:["Arandanos",9300,55],
    5:["Tomates",2100,42],
    6:["Fresas",4100,33],
    7:["Helado",4500,41],
    8:["Galletas",500,833],
    9:["Chocolates",3500,806],
    10:["Jamon",17000,10]
})

def AGREGAR():
    global productos
    codigo, producto, precio, inventario = input().split()
    precio = float(precio)
    inventario = int(inventario)
    
    if codigo in productos:
        print("ERROR")
    else:
        productos[codigo] = producto,precio,inventario
        return productos    

def BORRAR(codigo):
    global productos
    codigo, producto,precio, inventario = input().split()
    codigo=int(codigo)
    producto=str(producto)
    precio = float(precio)
    inventario = int(inventario)
    
    if codigo not in productos:
        print("ERROR")
    else:
      del(productos[codigo])
      return productos

def ACTUALIZAR():
    global productos
    codigo, producto, precio, inventario = input().split()
    codigo=int(codigo)
    precio = float(precio)
    inventario = int(inventario)
    if codigo not in productos:
        print("ERROR")
    else:
        codigo, producto, precio, inventario = input().split()
        productos[codigo] = producto, precio, inventario
        return productos

while True:
    opcion = input()

    if opcion == "AGREGAR":
        AGREGAR()                               
    elif opcion == "BORRAR":
        BORRAR(productos)
    elif opcion == "ACTUALIZAR":
        ACTUALIZAR()
    else:
        print("ERROR")    