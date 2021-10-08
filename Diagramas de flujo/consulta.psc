Algoritmo Consulta
	Definir tramo1, tramo2, tramo3, tramo4, citas1, citas2, citas3, citas4, costo Como Entero;
	tramo1 <- 20000;
	tramo2 <- 15000;
	tramo3 <- 10000;
	tramo4 <- 5000;
	Escribir "Indique que numero de cita corresponde"
	Leer cita;	
	Si cita > 3 Entonces
		citas1 <- 3;
		Si cita > 5 Entonces
			citas2 <- 2;
			Si cita > 8 Entonces
				citas3 <- 3;
				citas4 <- cita - 8;
				costo <- tramo4;
			SiNo
				citas3 <- cita - 5;
				costo <- tramo3;
			Fin Si
		SiNo
			citas2 <- cita - 3;
			costo <- tramo2;
		Fin Si
	SINO
		citas1 <- cita;
		costo <- tramo1;
	FinSi
	Escribir "La cita tendrá un costo de $",costo;
	Escribir "Hasta ahora, el costo total de tratamiento es de: $", (citas1*tramo1)+(citas2*tramo2)+(citas3*tramo3)+(citas4*tramo4);
FinAlgoritmo
