NDestinos = int(input("Ingrese el numero de destinos: "))
#CamasDobles, Piscinas, TViaje, TiposComida, Valor = int
# Initialize matrix 
matrix = []   
#  # For user input 
for i in range(NDestinos):          
# # A for loop for row entries     
    a =[] 
    a.append(input())   
    matrix.append(a)
print(matrix)

# # If conditionals for printing      
# # For printing the matrix 
for i in range(NDestinos):
    print(matrix[i]) 
    CamasDobles = []
    Piscinas = []
    TViaje = []
    TiposComida = []
    Valor = []
    variable1 = str(matrix[i])
    CamasDobles2, Piscinas2, TViaje2, TiposComida2, Valor2 = variable1.split()
    CamasDobles[i] = int(CamasDobles2)
print (CamasDobles)
print(Piscinas)


    