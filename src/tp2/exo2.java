package tp2;

public class exo2 {

	    public static <T> boolean sontEgaux(T[] tableau1, T[] tableau2) {
	       

	       
	        for (int i = 0; i < tableau1.length; i++) {
	        	
	            if (!tableau1[i].equals(tableau2[i])) {
	                return false;
	            }
	        }

	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Integer[] tableau1 = {1, 2, 3, 4, 5};
        Integer[] tableau2 = {1, 2, 3, 4, 9};
        System.out.println("tableau1 et tableau2 sont égaux : " + sontEgaux(tableau1, tableau2));
  */
	}

}
