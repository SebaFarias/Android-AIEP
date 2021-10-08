Algoritmo RelojControl
	Definir horasTrabajadas, sueldo Como Real;
	Definir i Como Entero;
	Escribir "Ingrese el valor de la hora trabajada:";
	Leer valorHora;
	Para i <- 1 Hasta 6 Con Paso 1 Hacer
		Escribir "Ingrese las horas trabajadas en el día ",i,":";
		Leer horas
		horasTrabajadas <- horasTrabajadas + horas;
	Fin Para
	sueldo <- horasTrabajadas * valorHora;
	Escribir "Horas trabajadas en la semana: ", horasTrabajadas;
	Escribir "Sueldo de la semana: $", sueldo;
FinAlgoritmo
