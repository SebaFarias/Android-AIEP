Algoritmo PrecioLapices
	Escribir "Ingrese cantidad de lápices"
	Leer cantidad
	Si cantidad >= 1000 Entonces
		precioFinal<-cantidad*85
	SiNo
		precioFinal<-cantidad*90
	Fin Si
	Escribir cantidad," lápices cuestan $", precioFinal
FinAlgoritmo
