def productoDisponibles():
    listas =list(productos.values())
    global productos1
    
    mayor=len(productos)
    precioMax = 0.0
    for x in range(0, len(mayor)):
        if productos[x] > precioMax:
            precioMax = productos[x]
            print(precioMax)
        else:
            x = float(listas[x][1])
            mayor =listas[x][0]
    
    y = float(listas[0][1])
    menor = listas[0][0]
    for j in range(0, len(productos)):
        if y < float(listas[j][1]):
            pass
        else:
            y=float(listas[j][1])
            menor=listas[j][0]
    
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

inicio = input("")
if inicio == "EJECUTAR":
        productoDisponibles()
else:
    print("NADA")