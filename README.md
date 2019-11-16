# definiciones recursivas 

para los trabajos de deficiones recursivas usaremos la siquiente estructura:

```
(*valor de retorno*)
TIPODEDATO retorno

(*caso base*)
SI consion HACER
	retorno = VALOR DE RETORNO EN CASO BASE
SINO
	(*paso resursivo*)
	retorno = OPERACION CON LLAMADO RECURSIVO
FIN SI
```
probemos con un ejemplo de esto:
```
MODULO FACTORIAL(ENTERO n)RETORNO ENTERO
	(*sacamos el factorial de n un numero entero*)
	(*este es el entero de retorno*)
	ENTERO retorno
	
	(*caso base: 0! = 1*)
	SI n == 0 HACER
		retorno = 1
	SINO
		(*paso recursivo: n! = n x (n-1)! *)
		retorno = n * FACTORIAL(n-1)
	FIN SI
	
	(*retornamos*)
	RETORNA retorno
FIN MODULO
```

en java:
```java
public static int factorial(int n){
       	int retorno;
        //caso base
        if(n == 0){
            retorno = 1;
        }else{
            //paso recursivo
            retorno = n * factorial(n-1);
        }
        return retorno;
}
```
