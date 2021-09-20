import operator

def AGREGAR():
    global productos
    #codigos = list(productos.keys())
    codigo, producto, precio, inventario = input().split()
    #producto = input("introduce el producto: ").capitalize()
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
      #print("eliminado")
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

def productoDisponibles():
    listas =list(productos.values())
    global productos1
    x = 0.0
    mayor=" "
    for i in range(0, len(productos)):
        if x > float(listas[i][1]):
            pass
        else:
            x = float(listas[i][1])
            mayor =listas[i][0]
    
    y = float(listas[0][1])
    menor = listas[0][0]
    for j in range(0, len(productos)):
        if y < float(listas[j][1]):
            pass
        else:
            y=float(listas[j][1])
            menor=listas[j][0]
    #max_key = max(productos1, key=lambda k:productos1[k])
    #print(productos1[max_key])
    #calculo del promedio de todos los productos
    suma = 0.0
    for z in range(len(productos)):
        suma += float(listas[z][1])
    promedio = suma / len(productos)
    #calculo del valor del inventario
    inventario1 = 0.0
    for v in range(len(productos)):
        inventario1 +=(float(listas[v][1])*int(listas[v][2]))

    #salida de datos
    print(mayor, menor, round(promedio,1), round(inventario1,1))

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
   # print()
    #print("AGREGAR")
    #print("VALORES")
    #print("BORRAR")
   # print("ACTUALIZAR")
    #print("MOSTRAR")

    opcion = input()

    if opcion == "AGREGAR":
        AGREGAR()
    
    elif opcion == "VALORES":
        productoDisponibles()
                               
    elif opcion == "BORRAR":
        BORRAR(productos)

    elif opcion == "ACTUALIZAR":
        ACTUALIZAR()

    elif opcion == "MOSTRAR":
        MOSTRAR()
    
    else:
        print("ERROR")

    print()