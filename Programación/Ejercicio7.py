
texto = input("Ingrese un texto: ")
texto2 = input("Ingrese la primer parte del texto: ")

contador1 = texto.count('')
contador2 = texto2.count('')

if contador1 <= contador2:
    print("la cadena contiene: ",contador2)
elif contador2 != contador1:
    print(slice(star=texto,stop=texto2))

    







