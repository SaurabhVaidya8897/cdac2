//Write a program in C to display n terms of natural number and their sum
#include<stdio.h>
main()
{
	int i,n,sum=0;
	printf("n terms of natural numbers ");
	scanf("%d",&n);
	for(i=1; i<=n; i++){
		printf(" %d",i);
		sum=sum+i;
	}
	printf("\nThe sum of natural numbers %d",sum);
		
}
