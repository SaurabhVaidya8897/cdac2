//Write a program in C to read 10 numbers from keyboard and find their sum and average.
#include<stdio.h>
main()
{
	int i;
	float n;
	float sum=0;
	float average;
	
	for(i=1; i<=10; i++){
		printf("enter %d numbers :",i);
		scanf("%f",&n);
		sum=sum+n;
	}
	average=sum/10;
	printf("\nThe sum of numbers %f",sum);
	printf("\nThe average of numbers %f",average);
		
}
