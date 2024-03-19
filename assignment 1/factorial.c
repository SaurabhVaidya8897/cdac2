//Write a C program to calculate the factorial of a given number
#include<stdio.h>
main()
{
	int fact=1,i;
	for(i=1; i<=5; i++){
		fact=fact*i;
}
	printf("\n%d",fact);
}
