'''Ejer 2'''

while True:
        try:
            n = int(input("Ingrese un número: "))
            lista = [1, 2, 3, 4, 5]
            lista[n]
            print(n," se encuentra en el lista")

        except IndexError:
            print(n," no se encuenta en la lista")

        print("Programa finalizado\n")