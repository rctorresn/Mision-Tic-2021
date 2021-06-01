'''Serie fibonacci'''

#Datos de entrada
n=int(input("ingrese un número: "))
w1=1
w2=2
s=0
c=0
print(1)

#Procedimiento y salida
if n<=0:
        print("error")
elif n==1:
        print(w1)
else:
    while c<n:
            print(w1)
            s=w1+w2
            w1=w2
            w2=s
            c+=1
