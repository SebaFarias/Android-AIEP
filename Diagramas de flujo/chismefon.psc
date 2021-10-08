Algoritmo Chismefon
	Definir minutos Como Real;
	Definir dia Como Caracter;
	Definir turno Como Caracter;
	Definir costoLlamada Como Real;
	Definir minutosTramo1 Como Real;
	Definir minutosTramo2 Como Real;
	Definir minutosTramo3 Como Real;
	Definir minutosTramo4 Como Real;
	minutosTramo1 <- 0;
	minutosTramo2 <- 0;
	minutosTramo3 <- 0;
	minutosTramo4 <- 0;
	
	Mientras minutos <= 0  Hacer
		escribir "Ingrese la duración de la llamada en minutos: "	secuencia_de_acciones
		leer minutos
	Fin Mientras
	Mientras dia <> "h" && dia <> "d" && dia <> "o" Hacer
		escribir "Ingrese el día de la llamada => (día (h)ábil / (d)omingo / (o)tro): "
		leer dia
	Fin Mientras
	Mientras turno <> "m" && turno <> "v" Hacer
		escribir "Ingrese el horario de la llamada => ( (m)atutino / (v)espertino ): "
		leer turno
	Fin Mientras
	Si minutos > 5 Entonces
		minutosTramo1 <- 5;
		Si minutos > 8 Entonces
			minutosTramo2 <- 3;
			Si minutos > 10 Entonces
				minutosTramo3 <- 2;
				minutosTramo4 <- minutos - 10;
			SINO
				minutosTramo3 <- minutos - 8;
			FinSi
		SiNo
			minutosTramo2 <- minutos-5;
		Fin Si
	SiNo
		minutosTramo1 <- minutos;
	Fin Si
	
	costoLlamada <- (minutosTramo1*100) + (minutosTramo2*80) + (minutosTramo3*70) + (minutosTramo4*50)  
	Si dia = "día hábil" Entonces
		Si turno = "m" Entonces
			costoLlamada <- costoLlamada * 1.15;
		SiNo
			costoLlamada <- costoLlamada * 1.10;
		Fin Si
	SiNo
		Si dia = "domingo" Entonces
			costoLlamada <- costoLlamada * 1.03;
		Fin Si
	Fin Si
	Escribir "el costo de la llamada es de $",costoLlamada;
FinAlgoritmo
