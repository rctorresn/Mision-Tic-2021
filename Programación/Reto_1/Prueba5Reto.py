Estudiantes = []
 
for i in range(2):
    nombre = input('Nombre del alumno: ')
    nota = int(input('Nota: '))
    edad = int(input('Edad: '))
 
    Alumnos = {}
    Alumnos['nombre'] = nombre
    Alumnos['nota'] = nota
    Alumnos['edad'] = edad
    Estudiantes.append(Alumnos)  ## Añadimos en cada iteración los inputs del usuario en la lista "Estudiantes"
 
print(Estudiantes)