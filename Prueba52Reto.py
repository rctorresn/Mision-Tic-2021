import operator

def AGREGAR():
    global productos
    codigo = int(input("Codigo del producto: "))
    producto = input("introduce el producto: ").capitalize()
    precio = int(input("precio: "))
    inventario = int(input("cantidad: "))
    if codigo in productos:
        print("Ese producto ya existe")
    else:
        productos[codigo] = producto,precio,inventario
        return productos

def ELIMINAR(codigo):
    global productos
    codigo = int(input("introduce el codigo del producto: "))
    if codigo not in productos:
        print("ERROR")
    else:
      del(productos[codigo])
      print("eliminado")
      return productos

def ACTUALIZAR():
    global productos
    codigo = int(input("ingrese el codigo del producto: "))
    if codigo not in productos:
        print("ERROR")
    else:
        producto = input("Ingrese el producto")
        precio = int(input("Nuevo costo: "))
        inventario = int(input("Nueva cantidad: "))

        productos[codigo] = producto, precio, inventario
        return productos

def productoDisponibles():
    global productos1
    max_key = max(productos1.keys(), key=lambda k:productos1[k])
    print(productos1[max_key])

def promedio(productos):
    producto1 = 1
    for n in productos:
        producto1 *= n
    return producto1


def MOSTRAR():
    print("Lista: ")
    print(productos)
    #for e in productos:
        #print(e)

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

productos1 = dict({
    1:9000,
    2:2300,
    3:2500,
    4:9300,
    5:2100,
    6:4100,
    7:4500,
    8:500,
    9:3500,
    10:17000
})


while True:
    print()
    print("AGREGAR")
    print("VALORES")
    print("ELIMINAR")
    print("ACTUALIZAR")
    print("MOSTRAR")

    opcion = input("-")

    if opcion == "AGREGAR":
        AGREGAR()
    
    elif opcion == "VALORES":
        productoDisponibles()
                               
    elif opcion == "ELIMINAR":
        ELIMINAR(productos)

    elif opcion == "ACTUALIZAR":
        ACTUALIZAR()

    elif opcion == "MOSTRAR":
        MOSTRAR()
    
    else:
        print("Error")

    print()




