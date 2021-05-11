numero
calcular 
suma pares
multiplicacion impares
det  si hay mas pares o impares

-------------------------------
numerosActuales = 0
sumaPares = 0
mplcaImpares = 1 
cantPares = 0
cantImpares = 0

---------PARA --------
canPares= 0    
sumaPares = 0
canImpares = 0
mulImpares =1
inicio para
para i =1, i++, i=numerosTotales
    si (i%2==0):
        sumaPares += i
        cantPares ++1
    sino :
        mulImpares *= i
        cantImpares ++
fin para


        
-------MIENTRAS------





sumaPares = 0
mplcaImpares = 1
cantPares = 0
cantImpares = 0
escribir "ingrese cantidad de numeros a ingresar"
leer numerosActuales
mientras 

mayor = 0
escribir "ingrese cantidad de numeros a ingresar"
leer cantNumeros
escribir "ingrese " + cantNumeros " numeros"
leer numeros

para: i = 0 hasta cantNumeros
    si ( numeros[i] > mayor )
        mayor = numeros[i]
fin para

escribir "el mayor numero es " + mayor


numero
calcular 
suma pares
multiplicacion impares
det  si hay mas pares o impares

---------- 1 --------
numerosActuales = 0
sumaPares = 0
mplcaImpares = 1 
cantPares = 0
cantImpares = 0

---------PARA --------
canPares= 0    
sumaPares = 0
canImpares = 0
mulImpares =1
inicio para
para i =1, i++, i=numerosTotales
    si (i%2==0):
        sumaPares += i
        cantPares ++1
    sino :
        mulImpares *= i
        cantImpares ++
        
Si cantPares> cantImpares:
            mayorNumero = cantPares
sino:
mayorNumero = CantImpares
        

fin para
    
-------MIENTRAS------

inicial = 1 
suma = 0
producto = 1
int numero = 0

Escribir"introduce el numero"
Leer el numero

 mientras (inicial < numero)
   si(inicial%2==0)
    suma = suma + inicial
   sino
     producto = producto * inicial;
   inicial++
  fin mientras

escribir ("La suma de los numero pares es: "+suma)
escribir ("El producto de los numeros impares es: "+producto)


------- 2 -------

mayor = 0
escribir "ingrese cantidad de numeros a ingresar"
leer cantNumeros
escribir "ingrese " + cantNumeros " numeros"
leer numeros

para: i = 0 hasta cantNumeros
    si ( numeros[i] > mayor )
        mayor = numeros[i]
fin para

escribir "el mayor numero es " + mayor

menor = 0
escribir "ingrese cantidad de numeros a ingresar"
leer cantNumeros
escribir "ingrese " + cantNumeros " numeros"
leer numeros

para: i = 0 hasta cantNumeros
    si ((i===0)   o (numeros[i] < menor))
        menor = numeros[i]
    fin si
fin para
escribir "el menor numero es " + menor
