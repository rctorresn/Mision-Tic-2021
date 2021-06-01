'''Ejemplo recorrer vocales'''

frase=input("Ingresa una frase: ")
cVocales=0

for i in frase:
        if i in "a,e,i,o,u":
                cVocales+=1

print("La cantidad de vocales es: ", cVocales)