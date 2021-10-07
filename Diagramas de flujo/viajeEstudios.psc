Algoritmo precioUvas
	Escribir 'Ingrese tipo (A o B)'
	Leer tipo
	Escribir 'Ingrese tamaño (1 o 2)'
	Leer size
	si tipo == A Entonces
		si size == 1 Entonces
			ajuste = 20
		SiNo ajuste= 30
		FinSi
	SiNo
		si size == 1 Entonces
			ajuste = -30
		SiNo ajuste = -50
		FinSi
	FinSi
 	Escribir "El Precio por kilo se debe ajustar en $",ajuste
FinAlgoritmo
