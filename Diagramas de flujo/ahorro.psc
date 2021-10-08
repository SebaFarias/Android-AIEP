Algoritmo Ahorro
	Definir i, acc Como Entero;
	Para i<-1 Hasta 12 Con Paso 1 Hacer
		Escribir "Ingrese el dinero ahorrado en el ", i, "° mes del año.";
		Leer monto;
		acc <- acc + monto;
		Si i<12 Entonces
			Escribir "Dinero ahorrado hasta el mes n°", i, ": $", acc;
		Fin Si
	Fin Para
	Escribir "Ahorro total del año: $", acc;
FinAlgoritmo
