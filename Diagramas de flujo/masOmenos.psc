Algoritmo masOmenos
	Definir i, positivos, negativos Como Entero;
	Escribir "Ingrese la cantidad de números que desea ingresar"
	Leer n;
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese el ", i, "° número.";
		Leer num;
		Si num > 0 Entonces
			negativos <- negativos + 1;
		SiNo
			positivos <- positivos + 1;
		Fin Si
	Fin Para
	Escribir "De las ", n, " cantidades ingresadas, ", negativos, " son menores o iguales a 0 y ", positivos, " son mayores que 0.";
FinAlgoritmo 
