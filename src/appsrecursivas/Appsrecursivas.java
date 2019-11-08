
package appsrecursivas;

/**
 * @author franco
 */
public class Appsrecursivas {
    public static int potenciaPositivaRecursiva(int numero, int potencia){
        int retorno;
        //caso base
        if(potencia == 0){
            retorno = 1;
        }else{
            //paso recursivo
            retorno = numero * potenciaPositivaRecursiva(numero, potencia - 1);
        }
        //valor de retorno
        return retorno;
    }
    
    public static float potenciaNegativaRecursiva(float numero, int potencia){
        //el valor potencia tiene que ser negativa
        float retorno;
        //caso base
        if(potencia == 0){
            retorno = (float) 1.0;
        }else{
            //paso recursivo
            retorno = (float)(1.0 /numero ) * potenciaNegativaRecursiva(numero, potencia - 1);
        }
        //retorno        
        return retorno;
    }
    
    public static float potenciaNegativaMain(int numero, int potencia){
        //el modulo main que controla el algoritmo recursivo
        float retorno;
        float num = numero;
        retorno = potenciaNegativaRecursiva(num, -1 * potencia);
        return retorno;
    }
    
    public static float potencia(int numero, int potencia){
        //valor de retorno
        float retorno;
        //en caso de ser mayor a cero
        if(potencia >= 0){
            retorno = (float)potenciaPositivaRecursiva(numero, potencia);
        }else{
            //en caso de ser menor a cero
            retorno = potenciaNegativaMain(numero, potencia);
        }
        //valor de retorno
        return retorno;
    }
    
    public static int cantidadMatriz(int[] arreglo, int longitud, int buscado){
        int retorno = 0;
        //caso base el primer elemento
        if(longitud == 0){
            if(arreglo[longitud] == buscado){
                retorno = retorno + 1;
            }
        }else{
            //caso recursivo
            if(arreglo[longitud] == buscado){
                retorno = 1 + cantidadMatriz(arreglo, longitud-1, buscado);
            }else{
                retorno = cantidadMatriz(arreglo, longitud - 1, buscado);
            }
        }
        
        return retorno;
    }
    
    public static int suma(int a, int b){
        int retorno;
        //caso base
        if(b == 0){
            retorno = a;
        }else{
            //paso recursivo
            retorno = 1 + suma(a, b-1);
        }
        
        return retorno;
    }
    
    public static int resta(int a, int b){
        int retorno;
        //caso base
        if(b == 0){
            retorno = a;
        }else{
            //paso recursivo
            retorno = resta(a, b-1) - 1;
        }
        
        return retorno;
    }
    
    
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,54,3,2,1};
        
        System.out.println(cantidadMatriz(a, a.length-1, 2));
        System.out.println("potencia positiva: "+potenciaPositivaRecursiva(1, 3));
        System.out.println("potencia negativa: "+potenciaNegativaMain(3, -3));
        System.out.println("potencia indiferente: (3,3)"+potencia(3, 3)+", (3,-3): "+potencia(3, -3));
        System.out.println("suma: "+suma(2,10));
        System.out.println("resta: "+resta(2,2));
    }
    
}
