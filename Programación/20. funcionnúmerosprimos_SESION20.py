'''funcion números primos'''

#Se pide el valor al usuario
valor=int(input("Ingresa un número: "))

#Se define la función que va a decidir si es primo o no
def es_primo(numero):
        #Se evalua condiciones iniciales 1 y 2
        if numero == 1:
                return False
        elif numero == 2:
                return True
        #Sino se cumple una condición inicial se corre el for
        else:
        #El ciclo for recorre los numeros buscando si se dividen por alguien mas
            for i in range (2,numero):
                if numero % i == 0:
                    return False
            return True

#Se recorre el for llamando la funcion para poder decir cual es primo
for i in range(1,valor+1):
        print(i,es_primo(i))


