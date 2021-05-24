SalarioBase = int(input())
HorasExtra = int(input())
Bonificacion = input()

ValorHora = (SalarioBase/190)

if Bonificacion == 1:
    Bonificacion = (ValorHora * 0.035)
else:
    Bonificacion = 0

if HorasExtra >= 1:
    HorasExtra = (ValorHora * 0.45)
else:
    HorasExtra = 0

SalarioTotal = (SalarioBase + HorasExtra + Bonificacion)

PlanSalud = (SalarioTotal * 0.065)
Pension = (SalarioTotal * 0.05)
CajaCompensacion = (SalarioTotal * 0.04)

SalarioTotalDescuentos = (SalarioTotal - PlanSalud - Pension - CajaCompensacion)

print(round(SalarioTotalDescuentos,2))
print(round(SalarioTotal,2))