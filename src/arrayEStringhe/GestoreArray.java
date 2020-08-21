package arrayEStringhe;

import java.util.Arrays;

public class GestoreArray {

	private int[] arrayInt;
	
	public GestoreArray(int[] array) {
		arrayInt = array;
	}
	
	/**
	 * search an int value in the array and return its index, if the value it's not in the array 
	 * return -1
	 * @param intToFind
	 * @return index of intToFind in the array otherwise -1
	 */
	public int indexOf(int intToFind) {
		for(int i=0; i<arrayInt.length; i++)
			if(arrayInt[i] == intToFind) return i;
		return -1;
	}
	
	/**
	 * concatenate an input int array to the one saved in this object
	 * @param arrayToConcat
	 */
	public void concat(int[] arrayToConcat) {
		int[] newArray = new int[arrayInt.length + arrayToConcat.length];
		int currIndex = 0;
		for(int i=0; i<arrayInt.length; i++)
			newArray[currIndex++] = arrayInt[i];
		for(int i=0; i<arrayToConcat.length; i++)
			newArray[currIndex++] = arrayToConcat[i];
		arrayInt = newArray;
	}
	
	private int[] concatAndReturn(int[] startArray, int[] arrayToConcat) {
		int[] newArray = new int[startArray.length + arrayToConcat.length];
		int currIndex = 0;
		for(int i=0; i<startArray.length; i++)
			newArray[currIndex++] = startArray[i];
		for(int i=0; i<arrayToConcat.length; i++)
			newArray[currIndex++] = arrayToConcat[i];
		return newArray;
	}
	
	public int concatNoDup(int[] arrayToConcat) {
		int[] newArrayWithIntToAdd = new int[0];
		boolean alreadyPresent = false;
		for(int i=0; i<arrayToConcat.length; i++) {
			alreadyPresent = false;
			//controllo se si trova nell'array arrayInt
			for(int k: arrayInt) {
				if(k == arrayToConcat[i]) {
					alreadyPresent = true; 
					break;
				}
			}
			if(!alreadyPresent)
				newArrayWithIntToAdd = concatAndReturn(newArrayWithIntToAdd, new int[] {arrayToConcat[i]});
		}
		//concateno l'array di interi da aggiungere ad arrayInt
		concat(newArrayWithIntToAdd);
		return arrayToConcat.length - newArrayWithIntToAdd.length;
	}
	
	public boolean replace(int x, int y) {
		for(int i=0; i<arrayInt.length; i++) {
			if(arrayInt[i] == x) {
				arrayInt[i] = y; 
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arrayInt);
	}
	
	public static void main(String[] args) {
		GestoreArray  ga = new GestoreArray(new int[] {1,2,3,4,5});
		System.out.println(ga);
		ga.concat(new int[] {6,7,8});
		System.out.println(ga);
		ga.concatNoDup(new int[] {1,2,3,9,12,5,6,11});
		System.out.println(ga);
		ga.replace(3, 25);
		System.out.println(ga);
	}
}
