// CUENTA CUANTOS ELEMENTOS DEL ARREGLO TIENEN CANTIDAD DE DIGITOS PARES
public class NumerosPares {

	public int numerosCifrasPares(int[]nums) {
	        int pares=0;
	        for(int i = 0; i<nums.length; i++){
	                if(Integer.toString(nums[i]).length()%2==0){
	                pares++;
	            }
	        }
	        return pares;
	    }
	
	public static void main(String[] args) {
		NumerosPares obj = new NumerosPares();
		int[] conjuntoNumeros = {22,1,8444,3,6};
		System.out.println(obj.numerosCifrasPares(conjuntoNumeros));
	}
}


