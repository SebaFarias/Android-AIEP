Algoritmo SumarPares
	Definir sumaPares Como Entero;
	Definir cant Como Entero;
	Definir temp Como Entero
	Definir index Como Entero;
	Escribir "¿Cuantos numeros quieres ingresar?";
	Leer cant;
	sumaPares <- 0;
	Para index<-1 Hasta cant Con Paso 1 Hacer
		Escribir "Ingresa ", index, "° numero";
		Leer temp
		Si temp % 2 == 0 Entonces
			sumaPares <- sumaPares + temp;
		Fin Si
	Fin Para
	Escribir "La suma de los numeros ares ingresados es: ", sumaPares;
FinAlgoritmo
