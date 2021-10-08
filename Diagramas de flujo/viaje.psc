Algoritmo Viaje
	Definir  COSTO_A Como Entero;
	Definir  COSTO_B Como Entero;
	Definir  COSTO_C Como Entero;
	Definir n Como Entero;
	Definir  costoTotal Como Real;
	Definir  costoXPersona Como Real;
	Escribir "Ingrese la cantidad de personas que viajaran"
	Leer cantidad;
	Escribir "Ingrese la distancia del viaje en Kms"
	Leer kms;
	Mientras tipo <> "A" && tipo <> "B"&& tipo <> "C" Hacer
		Escribir "Seleccione el tipo de bus ( A / B / C)"
		Leer tipo
	Fin Mientras
	Si cantidad < 20 Entonces
		n <- 20;
	SiNo
		n <- cantidad;
	Fin Si
	Si tipo = "A" Entonces
		costoTotal = kms * 200;
	SiNo
		Si tipo = "B" Entonces
			costoTotal = kms * 250;
		SiNo
			costoTotal = kms * 300;
		FinSi
	Fin Si
	Escribir "Costo total Servicio: $", costoTotal;
	Escribir "Costo por persona: $", costoTotal / cantidad;
FinAlgoritmo
