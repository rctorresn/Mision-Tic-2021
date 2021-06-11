'''producto escalar dos vectores'''

tamañoVector=2
v=[10,20]
W=[30,40] 
print (v)
print (W)

def pEscalar():
        productoEscalar = 0
        for i in range(0,tamañoVector):
                productoEscalar=productoEscalar + (v[i] * W[i]) 
        print("El producto escalar entre los vectores es: ", productoEscalar)
        return

pEscalar()