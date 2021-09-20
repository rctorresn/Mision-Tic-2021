lista = [1,2,3,4,5]
N = input()
if N in lista:
    print("Tarjeta repetida")


otra_lista = ["perro", "gato", "conejo"]
try:
    otro_indice = otra_lista.index("caballo")
    print("caballo está en la posición {} de otra_lista".format(otro_indice))
except:
    print("Lo siento, caballo no está en la lista")

