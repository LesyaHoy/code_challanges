package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a= new int[]{1,2,3,4,5};
        int[] b = new int[]{1,2};


	    System.out.println("" + findMediane(b, b));
	    System.out.println("" + findMediane(b, b));
    }

    public static double findMediane(int[] a, int[] b){
        int aLength = a.length;
        int bLength = b.length;
        double aMediane = aLength%2 == 0?(a[aLength/2-1]+a[aLength/2])/2.0:a[aLength/2];
        double bMediane = bLength%2 == 0?(b[bLength/2-1]+b[bLength/2])/2.0:b[bLength/2];



        return aMediane;
    }
}
