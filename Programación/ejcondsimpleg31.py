'''Ejemplo condicional simple'''

#Entradas
p_int=int(input("ingrese el porcentaje de intereses: "))
cap=int(input("Valor capital: "))
capf=0

#Desarrollo del problema
interes=cap*(p_int/100)

if interes>7000:
    capf=cap+interes

#salida
print("Capital final: ",capf)


