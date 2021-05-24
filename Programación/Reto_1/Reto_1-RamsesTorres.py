SalarioBase,HorasExtra,Bonificacion = input().split()
SalarioBase=float(SalarioBase)
HorasExtra=float(HorasExtra)
Bonificacion=float(Bonificacion)

ValorHora=(SalarioBase/190)

if HorasExtra>=1:
    HorasExtra=((ValorHora*0.45)*(HorasExtra))+(ValorHora)
else:
    HorasExtra=0

if Bonificacion==1:
    Bonificacion=((SalarioBase*0.035)+(ValorHora))
else:
    Bonificacion=0

SalarioTotal=(SalarioBase+HorasExtra+Bonificacion)

PlanSalud=round((SalarioTotal*0.065),3)

Pension=round((SalarioTotal*0.05),3)

CajaCompensacion=round((SalarioTotal*0.04),3)

SalarioTotalDescuentos=round((SalarioTotal-PlanSalud-Pension-CajaCompensacion),1)

print(SalarioTotalDescuentos, round(SalarioTotal,1))