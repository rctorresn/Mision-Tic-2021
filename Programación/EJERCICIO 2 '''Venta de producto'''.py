'''Venta de producto'''

#Problema: Cuanto puede llegar a venderse el producto que se fabrica

#Entradas
Nombre=input("Ingrese el nombre del producto: ")
Codigo=input("Ingrese el codigo del producto: ")
Costo_de_produccion=float(input("Ingrese el costo de la produccion: "))

#Procedimientos
Utilidad=Costo_de_produccion*1.20
Impuesto=Costo_de_produccion*0.15
Costo_de_venta=Costo_de_produccion+Utilidad+Impuesto

#salidas
print("El producto se puede vender en: $", Costo_de_venta)