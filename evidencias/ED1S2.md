# Leo's
Clase día 1 - semana 2

Integrantes: Leonardo Rodenas Escobar, Ignacio Cavallo, Camila Campos, Evelyn Ibarra y Jonathan Rosales.
E-mails: leo.rodenas.e@gmail.com, ignaciomcavallo@gmail.com, ibarrarojas.evelyn@gmail.com, jonathan.rosales.tognarelli@gmail.com y camila.campos.soto@gmail.com

Ejercicio grupal 1: Pensar en dos problemáticas las cuales podamos resolver aplicando tecnología (software). luego analizar y definir tres requerimientos funcionales y determinar todas las variables y constantes que pueden existir dentro de estos requerimientos para luego desarrollar el algoritmo para cada uno de estos.

Problemática 1: Necesitamos realizar un dibujo para una presentación
Requerimientos funcionales: Necesidad contar con un lápiz, borrador y cambiar paleta de colores.

Variables: 

Lápiz: Dirección del trazado (variable), grosor (constante)
Borrador: Dirección del borrado (variable), Acción de borrado (constante)
Cambio de colores: Paleta de colores (constante), selección de color (variable)

Algoritmo:

1.Lápiz = selección de herramienta lápiz (entrada), punto inicial y final del vector (proceso), línea trazada (salida)
2.Borrador = selección de herramienta borrador (entrada), click en lo que se desea borrar (proceso) y acción de borrar (salida).
3.Cambio de color = Selección de color "A" (entrada), selección de color "B" distinto a "A" (proceso), nuevo color seleccionado (salida)

Problemática 2: Aplicación de lista de compras compartida.

Problemática 1: Necesidad de recordar los artículos a comprar para abastecer la despensa. 
Requerimientos funcionales: Lista de compras, Compartir lista con otros usuario autorizados, Agregar elemento, marcar elemento y quitar elemento

Variables: 

Lista de compra: ítems en la lista (variable)
Compartir lista:  acción de compartir (variable)
Agregar elemento: Usuario (constante) y ítem a agregar (variable)
Marcar (tachar) ítem: usuario (constante), marcado (tachado) (variable) e ítem (variable)
Quitar ítem: Usuario (constante), ítem (variable), quitar elemento (constante)

Algoritmo:

1.Lista de compra = Anotar ítems en la lista (entrada), guardar lista (proceso) y lista creada (salida).
2.Compartir lista = Seleccionar integrantes con quienes compartir (entrada), seleccionar la opción compartir (proceso) y lista compartida con los integrantes de compra (salida)
3.Agregar ítem = ingresar nombre del ítem a comprar (entrada), registrar ítem en la lista (proceso) y generar listado de ítems a adquirir en la tienda(salida)
4.Marcar ítem = seleccionar ítem a marcar (tachar) (entrada), tachar ítem ya comprado (proceso) y ítem tachado, significa objeto adquirido (salida)
5.Quitar ítem = seleccionar ítem a quitar (entrada), seleccionar remover ítem (proceso) e ítem eliminado (salida)

__________________________________________________________________________________________________________________


Ejercicio 2: Escribir algoritmo en pseudocódigo donde se le solicite al usuario ingresar 2 números.

Observación: números a ingresar son "1" y "2"
Variable: a = 1
	  b = 2

INICIO
	"Escribe número a"
	"Leer a"
	"Numero ingresado es a"
	"1"
	"Escribe número b"
	"Leer b"
	"Numero ingresado es b"
	"2"
	"Imprimir numero ab"
	"12"
FIN


Actividades del día 1, semana 2.

(Lunes 3 de mayo de 2021)

---

# Seba's
### 1. Pensar en dos problemáticas las cuales podamos resolver aplicando tecnología (software), luego analizar y definir tres requerimientos funcionales y determinar todas las variables y constantes que pueden existir dentro de estos requerimientos para luego desarrollar el algoritmo para cada uno de estos.

---


### Problema 1: Una persona quiere llevar registro de sus notas en un curso.

#### Requerimientos funcionales.

1. Registrar notas.
2. Calcular promedio.
3. Determinar si aprueba o reprueba el curso.

#### Entradas.

> #### Variables.
- Notas.

> #### Constantes.
- Nota de aprobación.

#### Proceso.

1. Ingresar notas.
2. Calcular promedio.
3. Si el promedio es igual o superior a la nota de aprobación, el estado de aprobación es "Aprueba". De lo contrario, es "Reprueba".
4. Mostrar promedio.
5. Mostrar estado de aprobación.

#### Salida.

- Registro de notas.
- Promedio.
- Estado de aprobación.

---

#### Problema 2: Tomar lista de asistencia a una reunión o evento con personas registradas previamente.

#### Requerimientos funcionales:

1. Registrar el estado de asistencia de cada persona invitada a un evento.
2. Mostrar lista de personas presentes.
3. Mostrar lista de personas ausentes.

#### Entradas.

> #### Constantes.
- Lista de personas registradas para el evento.

> #### Variables.
- Estado de asistencia de cada persona registrada.

#### Proceso.

1. Ingresar el estado de asistencia de cada persona registrada para el evento.
2. Mostrar lista de personas presentes.
3. Mostrar lista de personas ausentes.

#### Salida.

- Lista de personas presentes.
- Lista de personas ausentes.

---

### 2. Escribir un algoritmo en seudocódigo que solicite ingresar 2 números.

  ```
    escribir "Ingrese un número: "
    leer num1
    escribir "Ingrese otro número: "
    leer num2
  ```

              
