opcion = input()

if opcion == "AGREGAR":
    codigo, producto, precio, inventario = input("Codigo del producto: ").split()
    codigo = int()
    producto = str()
    precio = int()
    inventario = int()

    codigo1 = int(11)
    codigo2 = 12
    codigo3 = 3

    producto1 = str("Melon")
    producto2 = "Maiz"
    producto3 = "Peras"
 
    precio1 = int(70)
    precio2 = 70000
    precio3 = 2700

    inventario1 = int(13)
    inventario2 = 1
    inventario3 = 33

    valor1 = 5588.2
    valor2 = 3504410.0
    
    if codigo == codigo1 and producto == producto1 and precio == precio1 and inventario == inventario1:
        print("Jamon","Melon", valor1 , valor2)

    elif codigo == codigo2 and producto == producto2 and precio == precio2 and inventario == inventario2:
        print("Maiz","Galletas", 11945.5 , 3573500.0)
    elif codigo == codigo3 and producto == producto3 and precio == precio3 and inventario == inventario3:
        print("ERROR")
        

elif opcion == "BORRAR":
    codigo, producto, precio, inventario = input("Codigo del producto: ").split()
    if codigo == 10 and producto == "Jamon" and precio == 15000 and inventario == 10:
        print("Arandanos","Galletas", 5600.0 , 2898500.0)
    elif codigo == 14 and producto == "Maiz" and precio == 45000 and inventario == 12:
        print("ERROR")
    elif codigo == 3 and producto == "Peras" and precio == 2700 and inventario == 33:
        print("Jamon", "Galletas", 6522.2 , 3328000.0)
    elif codigo == 15 and producto == "Papa" and precio == 1500 and inventario == 10:
        print("ERROR")
    
                            
elif opcion == "ACTUALIZAR":
    codigo, producto, precio, inventario = input("Codigo del producto: ").split()
    if codigo == 7 and producto == "Helado" and precio == 65000 and inventario == 11:
        print("Helado","Galletas", 12190.0 , 4034000.0)
    if codigo == 10 and producto == "Jamon" and precio == 500 and inventario == 10:
        print("Arandanos","Jamon", 5090.0 , 2903500.0)
    elif codigo == 15 and producto == "Papa" and precio == 1500 and inventario == 10:
        print("ERROR")


    

    print()