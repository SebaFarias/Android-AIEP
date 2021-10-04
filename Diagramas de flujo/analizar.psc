Algoritmo SumarPares
	Definir sumaPares Como Entero;
	Definir multImpares Como Entero;
	Definir cant Como Entero;
	Definir temp Como Entero;
	Definir index Como Entero;
	Definir cantPares Como Entero;
	Definir cantImpares Como Entero;
	Definir max Como Entero;
	Escribir "¿Cuantos numeros quieres ingresar?";
	Leer cant;
	sumaPares <- 0;
	multImpares <- 1;
	Para index<-1 Hasta cant Con Paso 1 Hacer
		Escribir "Ingresa ", index, "° numero";
		Leer temp
		Si temp > max Entonces
			max <- temp
		FinSi
		Si temp % 2 == 0 Entonces
			sumaPares <- sumaPares + temp;
			cantPares <- cantPares + 1;
		SiNo
			multImpares <- multImpares * temp;
			cantImpares <- cantImpares + 1;
		Fin Si
	Fin Para
	Escribir "La suma de los numeros pares ingresados es: ", sumaPares;
	Escribir "La multiplicacion de los numeros impares ingresados es: ", multImpares;
	Si cantPares < cantImpares Entonces
		Escribir "Se ingresaron más números Impares que pares";
	SiNo
		Escribir "Se ingresaron más números Pares que impares";
	FinSi
	Escribir "El número más grande de los ingresados es : ",max; 
FinAlgoritmo
