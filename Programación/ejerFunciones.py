''' Ejer #3 '''
print("\nEjercicio #3\n")
def precioVenta(costo):
        precioVenta = (costo+(costo*1.2)+(costo*0.15))
        return precioVenta

def main():
        costoProducto = float(input("Digite el costo del producto: "))
        nombreProducto = input("Digite el nombre del producto: ")
        
        print("\nEl producto ", nombreProducto, " tiene un costo total de venta = $",precioVenta(costoProducto))
        print("\nFin del ejercicio")
       
main()
