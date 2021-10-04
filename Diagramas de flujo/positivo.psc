Algoritmo Positivo
	Definir num1 Como Real;
	Definir num2 Como Real;
	Definir sum Como Real;
	Definir resultado Como Caracter;
	Escribir "Ingrese un número";
	Leer num1;
	Escribir "Ingrese otro número";
	Leer num2;
	sum <- num1 + num2;
	Si sum < 0 Entonces
		resultado <- "negativo";
	SiNo
		Si sum == 0 Entonces
			resultado <- "cero";
		SiNo
			resultado <- "positivo";
		FinSi		
	Fin Si
	Escribir "La suma de ", num1 , " y ", num2, " es ",resultado;
FinAlgoritmo
