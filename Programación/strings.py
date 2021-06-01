'''Cadenas de caractéres (strings)'''

print("Yo soy un string") #Comillas dobles (recomendado)
print('Yo tambien soy un string') #Comillas simples
print('"yo soy un string"')
type("Yo soy un string")
print("hola"+" mundo")

# Vamos a generar un error en Python!!
#print('Hola 'mundo', aca estoy!')

# Alternativa 1: Incluir caracter de escape \ (secuencias de escape)
print('Hola \'mundo\', aca estoy! ')
# Alternativa 2: Intercambiar el delimitador del string
print("Hola 'mundo', aca estoy! ")
#Como imprimo el backslash \?
print("\\")
#Usando triple comillas
print('''Las comillas triples me permiten incluir comillas simples (')
            y dobles (") sin necesidad del caracter de escape''')

frase="Hola mundo"
print(len(frase))   #cantidad de elementos en el string
print(frase.count("o")) #Contar elementos espeficos en el string
print(frase.upper()) #Convertir en mayusculas
print(frase.lower()) #Convertir en minusculas
print(frase.replace("Hola", "cambio")) #cambiar un elemento del string

frase="     Hola mundo     "
print(frase)
print(frase.strip()) #Quitar los espacios al principio y final
print(frase.lstrip()) #Quitar los espacios al  inicio
print(frase.rstrip(),"final") #Quitar los espacios al final

 
frase="Ejemplo elefante"
print(frase)
frase=frase.replace("e","4")
print(frase)




