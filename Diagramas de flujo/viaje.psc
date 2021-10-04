Algoritmo Viaje
	Definir cant Como Entero;
	Definir total Como Entero;
	Escribir "¿Cuantos estudiantes iran?"
	Leer cant
	Si cant > 29 Entonces
		Si cant > 49 Entonces
			Si cant > 99 Entonces
				total = cant * 6500;
			SiNo
				total = cant * 7000;
			Fin Si
		SiNo
			total = cant * 9500;
		Fin Si
	FinSi
	Escribir "Pago a la Compañia : $",total;
	Escribir " Coste por alumno : $", total / cant;
FinAlgoritmo
