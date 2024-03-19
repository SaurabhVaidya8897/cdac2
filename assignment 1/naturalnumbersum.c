//Write a C program to find the sum of first 10 natural numbers.
#include<stdio.h>
main()
{
	int i,sum=0;
	printf("First 10 natural numbers");
	for(i=1; i<=10; i++){
		printf(" %d",i);
		sum=sum+i;
	}
	printf("\nThe sum of natural numbers %d",sum);
		
	
}
