//Write a program in C to display the n terms of odd natural number and their sum
#include <stdio.h>
main(){
    int n,i,sum=0,odd;

    printf("Enter the number of terms: ");
    scanf("%d",&n);

    printf("The first %d odd natural numbers are: ",n);
    for (i=1; i<=n; i++){
    	if(n%2!=0)
    		odd= 2*i-1;
        	printf("%d ",odd);
        	sum=sum+odd;
    }

    printf("\nSum of the first %d odd natural numbers: %d\n", n, sum);
}

