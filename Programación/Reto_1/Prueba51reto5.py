productos = [1,"PAN",200,20]

while True:
    print("AGREGAR")
    print("ELIMINAR")
    print("MOSTRAR")

    opcion = input("-")

    if opcion == "AGREGAR":
        codigo = int(input("Codigo del producto: "))
        producto = input("introduce el producto: ").capitalize()
        precio = int(input("precio: "))
        inventario = int(input("cantidad: "))
        if codigo in productos:
            print("Ese producto ya existe")
        else:
            productos.append(codigo)
            productos.append(producto)
            productos.append(precio)
            productos.append(inventario)

    elif opcion == "ELIMINAR":
        producto = input("introduce el producto: ")
        if producto not in productos:
            print("ese producto no esta en la lista")
        else:
            producto.remove(productos)

    elif opcion == "MOSTRAR":
        print("Lista: ")
        for e in productos:
            print(e)
    else:
        print("Error")

    print()

